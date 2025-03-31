import java.util.*;

class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k < 2)
            return 0;
        int n = weights.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++)
            list.add(weights[i] + weights[i + 1]);
        Collections.sort(list);
        long minSum = 0;
        for (int i = 0; i < k - 1; i++)
            minSum += list.get(i);
        Collections.sort(list, Collections.reverseOrder());
        long maxSum = 0;
        for (int i = 0; i < k - 1; i++)
            maxSum += list.get(i);
        return maxSum - minSum;
    }
}
