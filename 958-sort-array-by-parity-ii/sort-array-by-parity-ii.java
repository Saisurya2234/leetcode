class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int odd = 1;  
        int even = 0;
        
        int[] result = new int[nums.length];
        
        for(int i : nums){
            if(i % 2 == 0){
                result[even] = i;
                even += 2;
            }else{
                result[odd] = i;
                odd += 2;       
            } 
        }

        return result;

    }
}