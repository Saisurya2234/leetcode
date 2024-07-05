class Solution {
    public int minCost(String colors, int[] n) {
       int a=0;
       int e=colors.length();
       for(int i=0;i<e-1;i++){
        if(colors.charAt(i)==colors.charAt(i+1)){
            if(n[i]<n[i+1]){
                a+=n[i];
            }
            else{
                a+=n[i+1];
                n[i+1]=n[i];
            }
        }
       }
       return  a;
        
    }
}