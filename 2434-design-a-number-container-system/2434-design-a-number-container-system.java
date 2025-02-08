class NumberContainers {
    Map<Integer, Integer> map;
    Map<Integer, TreeSet<Integer>> minIndex;

    public NumberContainers() {
        map = new HashMap<>();
        minIndex = new HashMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {
            int oldNumber = map.get(index);
            if (oldNumber != number) {
                minIndex.get(oldNumber).remove(index);
                if (minIndex.get(oldNumber).isEmpty())
                    minIndex.remove(oldNumber);
            }
        }
        map.put(index, number);
        minIndex.putIfAbsent(number, new TreeSet<>());
        minIndex.get(number).add(index);
    }

    public int find(int number) {
        if (minIndex.containsKey(number) && !minIndex.get(number).isEmpty())
            return minIndex.get(number).first();
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */