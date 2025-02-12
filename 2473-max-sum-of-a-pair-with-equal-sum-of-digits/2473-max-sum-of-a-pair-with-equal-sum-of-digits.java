import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int maxVal = -1;
        for (int num : nums) {
            int sum = sumOfDegi(num);
            int[] largest = map.getOrDefault(sum, new int[] { -1, -1 });
            if (num > largest[0]) {
                largest[1] = largest[0];
                largest[0] = num;
            } else if (num > largest[1])
                largest[1] = num;
            map.put(sum, largest);
        }
        for (int[] largest : map.values())
            if (largest[1] != -1)
                maxVal = Math.max(maxVal, largest[0] + largest[1]);
        return maxVal;
    }

    private int sumOfDegi(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
