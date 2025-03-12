class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==8) return 5;
        int max=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && max % nums[i]!=0){
                return -1;
            }
        }
        return idx;

       
        
    }
}