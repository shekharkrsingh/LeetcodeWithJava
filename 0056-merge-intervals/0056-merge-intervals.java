class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        int size=0;
        list.add(intervals[0][0]);
        list.add(intervals[0][1]);
        result.add(list);
        for(int i=1;i<n;i++){
            if(result.get(size).get(1)>=intervals[i][0]){
                result.get(size).set(1,Math.max(result.get(size).get(1), intervals[i][1]));
            }else{
                list=new ArrayList<>();
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
                result.add(list);
                size++;
            }
        }
        int [][] ans=new int [size+1][2];
        for(int i=0;i<=size;i++){
            ans[i][0]=result.get(i).get(0);
            ans[i][1]=result.get(i).get(1);
        }
        return ans;
    }
}