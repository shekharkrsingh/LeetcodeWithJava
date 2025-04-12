class Solution {

    static Integer[] factorial = new Integer[11];

    Solution() {
        int mul = 1;
        factorial[0] = 1;
        for (int i = 1; i <= 10; i++) {
            mul *= i;
            factorial[i] = mul;
        }
    }

    public long countGoodIntegers(int n, int k) {
        List<Long> listOfPall = new ArrayList<>();
        allPall(true, n, 0, listOfPall, 0);
        long count = 0;
        Set<String> set = new HashSet<>();
        System.out.println(listOfPall);
        for (long it : listOfPall) {
            if (it % k != 0)
                continue;
            String st = it + "";
            char[] charArray = st.toCharArray();
            Arrays.sort(charArray);
            st = new String(charArray);
            if (set.contains(st))
                continue;
            int[] map = new int[10];
            for (int i = 0; i < st.length(); i++) {
                map[st.charAt(i) - '0']++;
            }
            int totalComb = factorial[st.length()];
            for (int i = 0; i < 10; i++) {
                totalComb /= factorial[map[i]];
            }
            int notComb = 0;
            if (map[0] > 0) {
                notComb = factorial[st.length() - 1];
                notComb /= factorial[map[0] - 1];
                for (int i = 1; i < 10; i++) {
                    notComb /= factorial[map[i]];
                }
            }
            count += (totalComb - notComb);
            set.add(st);
        }
        return count;
    }

    private void allPall(boolean flag, int n, int count, List<Long> list, int num) {
        if (count >= n - (n / 2)) {
            String s = num + "";
            if (n % 2 == 0)
                s += swap(num);
            else if (n != 1)
                s += swap(num / 10);
            list.add(Long.parseLong(s));
            return;
        }
        int start = 0;
        if (flag)
            start = 1;
        for (int i = start; i <= 9; i++)
            allPall(false, n, count + 1, list, (num * 10) + i);
    }

    private String swap(long num) {
        StringBuilder s = new StringBuilder(num + "");
        s.reverse();
        return s.toString();
    }
}