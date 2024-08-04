class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> li = new ArrayList<>();
        findSubsum(nums, li);
        Collections.sort(li);
        int ans = 0;
        final int mod = (int)1e9 + 7;
        for (int i = left - 1; i < right; i++) {
            ans = (ans + li.get(i))%mod;
        }
        return ans;
    }

    private void findSubsum(int[] nums, List<Integer> li) {
        int n = nums.length;
        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                li.add(sum);
            }
        }
    }
}
