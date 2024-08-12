class Solution {
    public int maxProduct(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        return (nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        
    }
}