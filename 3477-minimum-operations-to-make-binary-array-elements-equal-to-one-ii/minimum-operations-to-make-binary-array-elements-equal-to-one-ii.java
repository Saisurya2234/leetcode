class Solution {
    public int minOperations(int[] nums) {
        int count=0;
		int flag =0;
		int n = nums.length;
		for(int i=0; i<n; i++) {
		    
			if(nums[i]==0 && flag==0) {
				nums[i]=1;
				count++;
				flag=1;
				continue;
				}
			
			if(nums[i]==1 && flag==1) {
				nums[i]=1;
				count++;
				flag=0;
				}
		}
		
		return count;
        
    }
}