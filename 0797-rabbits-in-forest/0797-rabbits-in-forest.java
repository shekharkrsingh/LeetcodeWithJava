class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int it : answers)
            if (it == 0)
                count++;
            else {
                if (!map.containsKey(it))
                    map.put(it, 0);
                map.put(it, map.get(it) + 1);
            }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int key = it.getKey() + 1;
            int val = it.getValue();
            count += key * (val / key);
            val %= key;
            if (val != 0)
                count += key;
        }
        return count;
    }
}