class Solution {
    public int[] vowelStrings(String[] words, int[][] arr) {
        int size = words.length;
        boolean isFound[] = new boolean[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            isFound[i] = containsVowels(words[i]);
        }
        int currCount[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (isFound[i]) {
                count++;
            }
            currCount[i] = count;
        }
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == arr[i][0]) {
                if (isFound[arr[i][1]])
                    ans[i] = 1;
                else
                    ans[i] = 0;
            } else if (isFound[arr[i][0]]) {
                ans[i] = currCount[arr[i][1]] - currCount[arr[i][0]] + 1;
            } else
                ans[i] = currCount[arr[i][1]] - currCount[arr[i][0]];

        }
        return ans;

    }

    private static boolean containsVowels(String s) {
        int l = s.length() - 1;
        if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u')
                && (s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o'
                        || s.charAt(l) == 'u')) {
            return true;
        }
        return false;
    }
}