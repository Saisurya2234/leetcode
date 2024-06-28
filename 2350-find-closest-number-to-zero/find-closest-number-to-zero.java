class Solution {
    public int findClosestNumber(int[] nums) {
  int ans=nums[0]; //assume first is nearest to zero
        for(int i=1;i<nums.length;i++){
			if(Math.abs(nums[i]) < Math.abs(ans) || nums[i] == Math.abs(ans))
				ans = nums[i];
        }
		return ans;
        
    }
}