class Solution {
    public int countKDifference(int[] nums, int k) {

        int n=nums.length;int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if((nums[i]-nums[j])==k && i!=j){
            count++;}
        }
       }
       return count;
        
    }
}