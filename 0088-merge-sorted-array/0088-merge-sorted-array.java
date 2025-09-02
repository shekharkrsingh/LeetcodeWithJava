class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m+n-1;
        m--;
        n--;
        while(idx>-1)
        {
            if(m<0)
            {
                nums1[idx]=nums2[n];
                n--;
                idx--;
                continue;
            }
            if(n<0)
            {
                nums1[idx]=nums1[m];
                m--;
                idx--;
                continue;
            }
            if(nums1[m]>=nums2[n])
            {
                nums1[idx]=nums1[m];
                m--;
                idx--;
            }else{
                nums1[idx]=nums2[n];
                n--;
                idx--;
            }
        }
    }
}