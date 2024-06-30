class Solution {
    public int maxProductDifference(int[] nums) {
        // in this problem we have to take the last two values and first two value & multiply it
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]);
    }
}