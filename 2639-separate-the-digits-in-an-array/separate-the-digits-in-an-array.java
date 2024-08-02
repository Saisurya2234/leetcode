class Solution {
    public int[] separateDigits(int[] nums) {
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]<10){
            li.add(nums[i]);
        }else{
            String s=String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                int ans=Integer.parseInt(String.valueOf(s.charAt(j)));
                li.add(ans);
            }
        }
    }
         int[] res=new int[li.size()];
         for(int i=0;i<li.size();i++){
        res[i]=li.get(i);
    }
    return res;

    }
}