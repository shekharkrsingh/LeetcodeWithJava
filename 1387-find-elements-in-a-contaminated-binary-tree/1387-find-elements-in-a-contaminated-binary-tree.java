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
class FindElements {
    Set<Integer> set=new HashSet<>();
    public FindElements(TreeNode root) {
        regenerate(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }

    private void regenerate(TreeNode root, int val){
        if(root==null)
        return;
        set.add(val);
        root.val=val;
        val*=2;
        regenerate(root.left, val+1);
        regenerate(root.right, val+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */