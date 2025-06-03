class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int level = 1;
        int ans = 1;
        int sum = Integer.MIN_VALUE;
        q.offer(root);
        while (!q.isEmpty()) {
            int currSum = 0;
            int size = q.size();
            while (size-- > 0) {
                TreeNode polled = q.poll();
                currSum += polled.val;
                if (polled.left != null) {
                    q.offer(polled.left);
                }
                if (polled.right != null) {
                    q.offer(polled.right);
                }
            }
            if (currSum > sum) {
                sum = currSum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}