class Solution {
    public int divide(int d, int di) {
        
        int ans=d/di;
        if(d==Integer.MIN_VALUE && di==-1){
            return Integer.MAX_VALUE;
        }
        return ans;
    }
}