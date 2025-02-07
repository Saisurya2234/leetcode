class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int max=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            max=Math.max(max,prices[i]-buy);
            buy=Math.min(buy,prices[i]);
        }
        return max;
        
    }
}