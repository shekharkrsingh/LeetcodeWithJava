class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            StringBuilder temp = new StringBuilder();
            list.add(temp);
        }
        if (numRows == 1 || len <= numRows)
            return s;
        int idx = 0;
        int nRow = 0;
        int changer = 1;
        System.out.println(list.size());
        while (idx < len) {
            if (nRow == numRows - 1)
                changer = -1;
            if (nRow == 0)
                changer = 1;
            list.get(nRow).append(s.charAt(idx));
            idx++;
            nRow += changer;
        }
        for (int i = 1; i < numRows; i++) {
            list.get(0).append(list.get(i));
        }
        return list.get(0).toString();
    }
}