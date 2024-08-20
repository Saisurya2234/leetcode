class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        comb(0,candidates,target,li,new ArrayList<>());
        return li;
    }
    public static void comb(int i,int[] arr,int target,List<List<Integer>> li,List<Integer> ans){
        if(i==arr.length){
            if(target==0){
                li.add(new ArrayList<>(ans));
            }
            return;
        }
    if(arr[i]<=target){
        ans.add(arr[i]);
        comb(i,arr,target-arr[i],li,ans);
        ans.remove(ans.size()-1);
    }
        comb(i+1,arr,target,li,ans);
    }    
    
}