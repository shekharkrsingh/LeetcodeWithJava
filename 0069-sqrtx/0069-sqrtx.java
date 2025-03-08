class Solution {
    public int mySqrt(int x) {
        return (int)binarySearch(0, x, x);
    }

    private long binarySearch(long left, long right, int x) {
        if (left > right)
            return right;
        long mid = left + (right - left) / 2;
        long square = mid * mid;
        if (square == x)
            return mid;
        if (square > x)
            return binarySearch(left, mid - 1, x);
        return binarySearch(mid + 1, right, x);
    }
}