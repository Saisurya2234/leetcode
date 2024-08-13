class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0;i<nums.length; i++) {
            for (int j=0;j<i;j++) {
                for (int k=0;k<j;k++) {
                    if (nums[i]-nums[j]==diff && nums[j]-nums[k]==diff) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
