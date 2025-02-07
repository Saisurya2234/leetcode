class Solution {
    public boolean check(int[] nums) {
       int n = nums.length;
        int countDecreases = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countDecreases++;
            }
        }
        if (countDecreases == 1) {
            return true;
        }
        else if (countDecreases == 0) {
            return true;
        }
        else {
            return false;
        }  
    }
}