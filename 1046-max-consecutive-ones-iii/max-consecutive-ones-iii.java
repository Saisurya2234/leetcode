class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    len=Math.max(len,j-i+1);
                }
                if(zero>k){
                    break;
                }
            }
            zero=0;
        }
        return len;
        
    }
}