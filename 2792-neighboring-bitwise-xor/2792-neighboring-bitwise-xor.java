class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        for(int i=1;i<derived.length;i++)
        derived[0]^=derived[i];
        return derived[0]==0?true:false;
    }
}