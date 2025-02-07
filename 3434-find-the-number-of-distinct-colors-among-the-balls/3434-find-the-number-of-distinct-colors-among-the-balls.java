import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballcolor = new HashMap<>();
        Map<Integer, Integer> colors = new HashMap<>();
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];
            if (ballcolor.containsKey(ball)) {
                int oldColor = ballcolor.get(ball);
                colors.put(oldColor, colors.get(oldColor) - 1);
                if (colors.get(oldColor) == 0)
                    colors.remove(oldColor);
            }
            ballcolor.put(ball, newColor);
            colors.put(newColor, colors.getOrDefault(newColor, 0) + 1);
            res[i] = colors.size();
        }
        return res;
    }
}