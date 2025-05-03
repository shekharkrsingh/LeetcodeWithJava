class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] harsh=new int[7];
        for(int i=0;i<tops.length;i++){
            harsh[tops[i]]++;
            harsh[bottoms[i]]++;
        }

        int max=Integer.MIN_VALUE;
        int num=0;
        for(int i=1;i<7;i++){
            if(harsh[i] > max){
                num=i;
                max=harsh[i];
            }
        }
        int up=0,down=0;
        for(int i=0;i<tops.length;i++){
            if(tops[i] == num || bottoms[i] == num){
                if(tops[i] == num)
                    up++;
                if(bottoms[i] == num)
                    down++;
            }
            else
                return -1;
        }
        return Math.min(tops.length-up,tops.length-down);
    }
}