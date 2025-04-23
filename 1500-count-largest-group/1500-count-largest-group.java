import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int val = sumOfDigit(i);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int maxSize = 0;
        int count = 0;

        for (int groupSize : map.values()) {
            if (groupSize > maxSize) {
                maxSize = groupSize;
                count = 1;
            } else if (groupSize == maxSize)
                count++;
        }

        return count;
    }

    private int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
