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
 class Pair{
    int height;
    TreeNode anc;

    Pair(int height, TreeNode anc){
        this.height=height;
        this.anc=anc;
    }
 }
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return sol(root).anc;
    }

    private Pair sol(TreeNode node){
        if(node==null)
        return new Pair(0, null);
        Pair left=sol(node.left);
        Pair right=sol(node.right);
        if(left.height==right.height)
        return new Pair(left.height+1, node);
        if(left.height>right.height)
        return new Pair(left.height+1, left.anc);
        else
        return new Pair(right.height+1, right.anc);
    }
}