class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int val1 = nums1[0];
        int val2 = nums2[0];
        for (int i = 1; i < n; i++)
            val1 ^= nums1[i];
        for (int i = 1; i < m; i++)
            val2 ^= nums2[i];
        return (n % 2) * val2 ^ (m % 2) * val1;
    }
}