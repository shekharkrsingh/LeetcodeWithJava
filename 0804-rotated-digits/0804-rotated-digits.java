class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    Solution(){
        map.put(0, 0);
        map.put(1, 0);
        map.put(8, 0);
        map.put(2, 1);
        map.put(5, 1);
        map.put(6, 1);
        map.put(9, 1);
        map.put(3, -1);
        map.put(4, -1);
        map.put(7, -1);
    }

    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (checkDigit(i))
                count++;
        return count;
    }

    private boolean checkDigit(int n) {
        boolean flag = false;
        while (n > 0) {
            if (map.get(n % 10) == -1)
                return false;
            else if (map.get(n % 10) == 1) {
                flag = true;
            }
            n/=10;
        }
        return flag;
    }
}