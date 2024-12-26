class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotate(0,nums.length-1,nums);
        rotate(0,k-1,nums);
        rotate(k,nums.length-1,nums);
        
            
    }
    static void rotate(int s,int e,int[]nums ){
        while(s < e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}