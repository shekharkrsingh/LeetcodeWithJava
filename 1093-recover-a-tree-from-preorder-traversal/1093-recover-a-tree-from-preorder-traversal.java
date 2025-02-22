/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Solution {
    static int index = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;
        return buildTree(traversal, 0);
    }

    private TreeNode buildTree(String traversal, int depth) {
        if (index >= traversal.length())
            return null;
        int count = 0;
        while ((index + count) < traversal.length() &&
                traversal.charAt(index + count) == '-')
            count++;
        if (count != depth)
            return null;
        index += count;
        int value = 0;
        while (index < traversal.length() &&
                Character.isDigit(traversal.charAt(index)))
            value = value * 10 + (traversal.charAt(index++) - '0');
        TreeNode node = new TreeNode(value);
        node.left = buildTree(traversal, depth + 1);
        node.right = buildTree(traversal, depth + 1);

        return node;
    }
}