class Solution {
    public void sortColors(int[] nums) {
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count_zero++;
            }
            else if(nums[i]==1){
                count_one++;
            }
            else{
                count_two++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count_zero!=0){
                nums[i] = 0;
                count_zero--;
            }
            else if(count_zero == 0 && (count_one>=1)){
                nums[i] = 1;
                count_one--;
            }
            else if(count_one ==0 && (count_two>=1)){
                nums[i] = 2;
                count_two--;
            }
        }
    }
}