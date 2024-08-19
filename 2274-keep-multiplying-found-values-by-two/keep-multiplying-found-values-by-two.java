class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                return findFinalValue(nums,2*original);
            }  
        } 
        return original;       
    }

}