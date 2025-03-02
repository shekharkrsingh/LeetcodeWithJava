class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length, m = nums2.length;
        List<int[]> list = new ArrayList<>();
        int idx1 = 0, idx2 = 0;
        while (idx1 < n || idx2 < m)
            if (idx1 < n && (idx2 == m || nums1[idx1][0] < nums2[idx2][0]))
                list.add(nums1[idx1++]);
            else if (idx2 < m && (idx1 == n || nums2[idx2][0] < nums1[idx1][0]))
                list.add(nums2[idx2++]);
            else {
                nums1[idx1][1] += nums2[idx2][1];
                list.add(nums1[idx1++]);
                idx2++;
            }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
