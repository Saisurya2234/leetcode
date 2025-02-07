class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int even=0;
        int odd=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] %2 == 0){
                ans[even]=nums[i];
                even+=2;
            }else{
                ans[odd]=nums[i];
                odd+=2;
            }
        }
        return ans;
        
    }
}