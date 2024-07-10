class Solution {
    public double minimumAverage(int[] nums) {
        
        int i =0;
        int j =nums.length-1;
        double min = Double.MAX_VALUE;
        Arrays.sort(nums);
        
        while(i<=j){
            
            double avg = nums[i]+ nums[j];
            
            avg = avg/2;
            
            min = Math.min(avg,min);  
            i++;
            j--;
            
            
        }
        return min;
    }
}