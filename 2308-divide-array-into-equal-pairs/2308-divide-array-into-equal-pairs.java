class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int a: nums){
            if(!map.containsKey(a))
            map.put(a, 0);
            map.put(a, map.get(a)+1);
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue()%2!=0)
            return false;
        }
        return true;
    }
}