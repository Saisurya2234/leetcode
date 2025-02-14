class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int max=-1;
        for(int n:nums){
            int tot=get(n);
            if(mp.containsKey(tot)){
                max=Math.max(max,n+mp.get(tot));
            }
             mp.put(tot, Math.max(mp.getOrDefault(tot, -1), n));
        }
        return max;    
    }
    public static int get(int n){
        int res=0;
        while(n>0){
            res+=n%10;
            n/=10;
        }
        return res;
    }
}