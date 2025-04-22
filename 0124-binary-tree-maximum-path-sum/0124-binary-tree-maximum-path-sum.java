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
class Solution {
    private  int result=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sol(root);
        return result;
    }

    private int sol(TreeNode node){
        if(node==null)
        return 0;
        int left=sol(node.left);
        int right=sol(node.right);

        int leftPath=left+node.val;
        int rightPath=right+node.val;
        int consider=Math.max(node.val, Math.max(rightPath, leftPath));
        result=Math.max(right+left+node.val, Math.max(result, consider));
        return consider;
    }
}