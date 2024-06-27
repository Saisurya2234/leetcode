class Solution {
    public int maxDepth(String s) {

        int ans = 0;
        int countOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countOpen++;
            } else if (s.charAt(i) == ')') {
                countOpen--;
            }

            ans = Math.max(ans, countOpen);
        }
        return ans;
    }
}