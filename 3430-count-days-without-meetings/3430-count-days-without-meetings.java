class Solution {

    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int count=0;
        int pre=0;
        for( int []arr: meetings){
            if(arr[0]-pre-1>0)
                count+=arr[0]-pre-1;
            pre=Math.max(pre, arr[1]);
        }
        count+=days-pre;
        return count;
    }
}