class Solution {
    public int[] getFinalState(int[] nums, int k1, int m) {
        int n=nums.length;
        for(int i=0;i<k1;i++){
            int min=Integer.MAX_VALUE;
            int k=0;
            for(int j=0;j<n;j++){
                if(nums[j]<min){
                    min=nums[j];
                    k=j;
                }  
            }
             nums[k]=nums[k]*m;
        }
        return nums;
        
         
    }
    
}