class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int arr[] = new int[colors.length + k - 1];
        for (int i = 0; i < colors.length; i++)
            arr[i] = colors[i];
        int i = 0;
        int idx = colors.length;
        while (i < k - 1 && i < colors.length) {
            arr[idx] = colors[i];
            i++;
            idx++;
        }
        int si = 0;
        int ei = 1;
        int count = 0;
        while (ei < colors.length + k - 1) {
            if (arr[ei] == arr[ei - 1]) {
                si = ei;
                ei++;
                continue;
            }

            if ((ei - si) + 1 == k) {
                count++;
                si++;
            }
            ei++;
        }
        return count;
    }
}