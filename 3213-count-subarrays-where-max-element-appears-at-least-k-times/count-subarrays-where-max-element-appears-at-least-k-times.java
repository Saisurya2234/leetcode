class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
         for (int num : nums) {
            max = Math.max(max, num);
        }
         int count=0; 
         long ans=0;
        for(int left=0,right=0;right<nums.length;right++){
            if(nums[right]==max) count++;
            while(count==k)
                if(nums[left++]==max) count--;
            ans=ans+left;
        }
        return ans;
    }
}