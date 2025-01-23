class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        int len = strs.length;

        List<String> sortedArray = new ArrayList<>();

        for (String s : strs) {
            int sLen = s.length();
            char[] charArray = new char[sLen];
            for (int i = 0; i < sLen; i++) {
                charArray[i] = s.charAt(i);
            }
            Arrays.sort(charArray);
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < sLen; i++)
                newString.append(charArray[i]);
            sortedArray.add(newString.toString());
        }
        for (int i = 0; i < len; i++) {
            if (map.containsKey(sortedArray.get(i))) {
                List<String> tempList = map.get(sortedArray.get(i));
                tempList.add(strs[i]);
                map.put(sortedArray.get(i), tempList);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                map.put(sortedArray.get(i), tempList);

            }
        }
        for (Map.Entry<String, List<String>> val : map.entrySet()) {
            list.add(val.getValue());
        }

        return list;
    }
}