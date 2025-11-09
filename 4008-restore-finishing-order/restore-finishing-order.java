class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int res[]= new int[n];
        int idx=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<n;j++){
                if(order[i]==friends[j]){
                    res[idx]=order[i];
                    idx++;

                }
            }
        }
        return res;
        
    }
}