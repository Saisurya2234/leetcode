class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[nums.length-1];
        int max=nums[nums.length-1];
        for( int i=nums.length-2;i>=0;i--){
            if( nums[i+1] > nums [i] ){
               sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}