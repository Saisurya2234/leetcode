class Solution {
    public boolean canAliceWin(int[] nums) {
        int ans=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
            ans+=nums[i];
            }
            if(nums[i]>=10){
            res+=nums[i];
            }
        }
        if(ans>res|| res>ans){
            return true;
        }
        return false;
        
    }
}