class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s=0;
        for(int i=m;i<nums1.length;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[s];
                s++;
            }
        }
        Arrays.sort(nums1);

          
    }
}