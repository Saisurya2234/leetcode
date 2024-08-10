class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0;
        int l=nums1.length;
        for(int i=m;i<l;i++)
        {
                if(nums1[i]==0){
                    nums1[i]=nums2[p++];
                }  
        }
        Arrays.sort(nums1);    
    }
}