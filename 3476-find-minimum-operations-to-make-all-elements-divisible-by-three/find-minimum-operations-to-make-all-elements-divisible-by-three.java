class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;
    }
}