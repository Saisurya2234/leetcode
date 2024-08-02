class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            res[i-1]=nums[i];
            res[i]=nums[i-1];
        }
        return res;

        
    }
}