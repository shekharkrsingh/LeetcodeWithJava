class Solution {
    public int partitionString(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }
            else{
                hm.clear();
                hm.put(c,1);
                count++;
            }
        }
        return count+1;
    }
}