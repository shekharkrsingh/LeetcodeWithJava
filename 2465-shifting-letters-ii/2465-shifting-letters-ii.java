class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int len = s.length();
        int[] shiftCount = new int[len + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if (direction == 1) {
                shiftCount[start]++;
                if (end + 1 < len) {
                    shiftCount[end + 1]--;
                }
            } else {
                shiftCount[start]--;
                if (end + 1 < len) {
                    shiftCount[end + 1]++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int cumulativeShift = 0;
        for (int i = 0; i < len; i++) {
            cumulativeShift += shiftCount[i];
            int totalShift = (cumulativeShift % 26 + 26) % 26;
            char shiftedChar = (char) ((s.charAt(i) - 'a' + totalShift) % 26 + 'a');
            result.append(shiftedChar);
        }

        return result.toString();
    }
}
