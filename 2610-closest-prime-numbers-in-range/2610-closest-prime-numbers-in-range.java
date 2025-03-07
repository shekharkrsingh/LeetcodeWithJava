class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] notPrimeCheck = new boolean[right + 1];
        int[] result = new int[2];
        result[0] = result[1] = -1;
        for (int i = 0; i < right + 1; i++)
            notPrimeCheck[i] = false;
        notPrimeCheck[1]=true;
        for (int i = 2; i < right + 1; i++)
            if (!notPrimeCheck[i]) {
                int j = 2;
                while (i * j <= right) {
                    notPrimeCheck[i * j] = true;
                    j++;
                }
            }
        int pre = -1;
        int diff = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++)
            if (!notPrimeCheck[i]) {
                if (pre != -1 && (i - pre) < diff) {
                    result[0] = pre;
                    result[1] = i;
                    diff = i - pre;
                }
                pre = i;
            }
        return result;
    }
}