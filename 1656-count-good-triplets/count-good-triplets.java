class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int a1=Math.abs(arr[i]-arr[j]);
                if(a1<=a){
                for(int k=j+1;k<arr.length;k++){
                    int b2=Math.abs(arr[j]-arr[k]);
                    int c3=Math.abs(arr[i]-arr[k]);
                    if(b2<=b && c3<=c){
                        count++;
                    }
                }
                }
            }
        }
        return count;
        
    }
}