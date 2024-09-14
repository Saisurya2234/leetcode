class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    li.add(nums1[i]);
                }
            }
        }
        HashSet<Integer> hs=new HashSet<>(li);
        int[] arr=new int[hs.size()];
        int k=0;
        for(int n:hs){
            arr[k]=n;
            k++;
        }
        return arr;
        
    }
}