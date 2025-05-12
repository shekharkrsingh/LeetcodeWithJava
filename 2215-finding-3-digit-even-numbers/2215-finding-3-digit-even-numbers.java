import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> res = new HashSet<>(); 
        int num = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(i == j || i == k || j == k) continue;
                    num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(num>=100 && num % 2 == 0) {
                        res.add(num);
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>(res);
        Collections.sort(list);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}