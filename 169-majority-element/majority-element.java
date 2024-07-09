class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length;
        return nums[index/2];
       
    }
}