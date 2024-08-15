class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int[] ans=new int[n];
        for(int i=1;i<=n;i++){
            ans[0]^=i;
        }
        for(int i=1;i<n-1;i+=2){
            ans[0]^=encoded[i];
        }
        for(int i=0;i<n-1;i++){
            ans[i+1]=encoded[i]^ans[i];
        }
        return ans;
    }
}