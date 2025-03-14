class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxVal = 0;
        for (int a : candies)
            maxVal = Math.max(a, maxVal);
        return binarySearch(0, maxVal, candies, k);
    }

    private int binarySearch(int left, int right, int[] candies, long k) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;
            for (int a : candies)
                count += a / (mid + 1);
            if (count >= k){
                left = mid + 1;
            }
            else 
                right = mid - 1;
        }
        return right+1;
    }
}
