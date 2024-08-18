class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return steps(dp,n);
        
    }
    public static int steps(int[] dp,int n){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }


        dp[n]=steps(dp,n-1)+steps(dp,n-2);
        return dp[n];
    }
}