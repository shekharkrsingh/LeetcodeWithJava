class Solution {
    public int differenceOfSums(int n, int m) {
        long sum = 0;
        int num = 1;
        long mSum = 0;
        while (num <= n) {
            if (num % m == 0)
                mSum += num;
            num++;
        }
        return (int) (((n * (n + 1)) / 2) - (2 * mSum));
    }
}