class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int s=0;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0){
                ans[s++]=nums[i];
            }else{
                ans[j--]=nums[i];
            }
        }
        return ans;
        
    }
}