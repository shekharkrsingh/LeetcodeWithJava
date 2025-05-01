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
    private int count;
    public int countPairs(TreeNode root, int distance) {
        List<Integer> list=sol(root, distance);
        if(list!=null)
        for(int it: list)
        System.out.println(it);
        return count;
    }

    private List<Integer> sol(TreeNode node, int distance){
        if(node==null)
        return null;
        List<Integer> left= sol(node.left, distance);
        List<Integer> right= sol(node.right, distance);
        
        if(left==null && right==null){
            List<Integer> newList=new ArrayList<>();
            newList.add(1);
            return newList;
        }
        
            System.out.println(left);
            System.out.println(right);
        if(left!=null && right!=null){
            for(int i=0;i<left.size();i++){
                for(int j=0; j<right.size();j++){
                    if(left.get(i)+right.get(j)<=distance)
                    count++;
                }
            }
        }
            List<Integer> list=new ArrayList<>();
            if(left!=null)
            for(int i=0;i<left.size();i++)
            list.add(left.get(i)+1);
            if(right!=null)
            for(int i=0;i<right.size();i++)
            list.add(right.get(i)+1);
            return list;
    }
}