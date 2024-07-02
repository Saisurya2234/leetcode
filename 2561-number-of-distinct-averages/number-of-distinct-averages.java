class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Float> s = new HashSet<>();
        int i=0,j=nums.length-1;
        float avg = 0;
        while (i < j) {
            avg=(nums[i]+nums[j])/2.0f;
            s.add(avg);
            i++;
            j--;
        }
        return s.size();
    }
}