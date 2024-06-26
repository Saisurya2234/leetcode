class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
       
        int sum=0;
        int sum1=0;
    
        for(int n:arr1){
            sum^=n;
        }
          for(int m:arr2){
            sum1^=m;
        } 
        return sum&sum1; 
    }
}