class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ans:nums){
            if(hm.containsKey(ans)){
                hm.put(ans,hm.get(ans)+1);
            }else{
                hm.put(ans,1);
            }
        }
        List<Integer> li=new ArrayList<>(hm.keySet());
        li.sort((a,b)-> hm.get(b)-hm.get(a));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=li.get(i);
        }
        return ans; 
    }
}