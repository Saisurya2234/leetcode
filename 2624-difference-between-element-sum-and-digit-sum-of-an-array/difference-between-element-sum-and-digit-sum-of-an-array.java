class Solution {
    public int differenceOfSum(final int[] nums) {
        int dSum = 0, eSum = 0;

        for(int num : nums) {
            eSum += num;

            while(num > 0) {
                dSum += num % 10;
                num /= 10;
            }
        }

        return Math.abs(eSum - dSum);
    }
}