class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean flag = true;
        for (int i = 0; i < ch1.length; i++)
            if (ch1[i] < ch2[i]) {
                flag = false;
                break;
            }
        if (flag)
            return flag;

        for (int i = 0; i < ch1.length; i++)
            if (ch2[i] < ch1[i])
                return false;

        return true;
    }
}