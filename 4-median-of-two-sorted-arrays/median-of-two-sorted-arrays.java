class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j;
      int [] ans = new int[nums1.length + nums2.length];
      for(i=0;i<nums1.length;i++){
        ans[i]=nums1[i];
      }  
      for(j=0;j<nums2.length;j++){
        ans[i+j]=nums2[j];
      }  
      Arrays.sort(ans);
      double median;
      if(ans.length %2==0){
        median = (ans[ans.length/2-1]+ans[ans.length/2])/2.0;
      }
      else{
        median = ans[ans.length/2];
      }
      return median;
    }
}