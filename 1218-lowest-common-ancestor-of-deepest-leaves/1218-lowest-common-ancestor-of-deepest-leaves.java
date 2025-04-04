/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Pair {
    TreeNode ancestor = null;
    int height = 0;

    Pair(TreeNode ancestor, int height) {
        this.ancestor = ancestor;
        this.height = height;
    }
}

class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Pair p = recursion(root);
        return p.ancestor;
    }

    private Pair recursion(TreeNode node) {
        if (node == null)
            return new Pair(null, 0);
        Pair left = recursion(node.left);
        Pair right = recursion(node.right);
        if (left.height == right.height)
            return new Pair(node, left.height + 1);
        if (left.height > right.height)
            return new Pair(left.ancestor, left.height + 1);
        return new Pair(right.ancestor, right.height + 1);
    }
}