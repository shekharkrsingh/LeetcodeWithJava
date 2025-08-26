class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        pascal.add(list);
        for (int i = 2; i <= numRows; i++) {
            list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(pascal.get(i - 2).get(j - 1) + pascal.get(i - 2).get(j));
                }

            }
            pascal.add(list);
        }
        return pascal;
    }
}