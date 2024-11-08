class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }else{
                hm.put(n,1);
            }
        }
        for(int res:hm.keySet()){
            if(hm.get(res)<3){
                return res;
            }
        }
        return -1;

        
    }
}