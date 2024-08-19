class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        subarray(li,ans,nums,0);
        return li;
  
    }
    public static void subarray(List<List<Integer>> res,List<Integer> ans,int[] nums,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        subarray(res,ans,nums,i+1);
        ans.remove(ans.size()-1);
        subarray(res,ans,nums,i+1);

    }
}