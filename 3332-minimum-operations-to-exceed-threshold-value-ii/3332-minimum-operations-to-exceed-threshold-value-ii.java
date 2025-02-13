class Solution {
    public int minOperations(int[] nums, int k) {
        int op = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums)
            if (num < k)
                pq.add(num);
        while (!pq.isEmpty()) {
            int x = pq.poll();
            op++;
            if (pq.isEmpty())
                break;
            int y = pq.poll();
            long newVal = (2L * Math.min(x, y)) + Math.max(x, y);
            if (newVal < k)
                pq.add((int) newVal);
        }
        return op;
    }
}