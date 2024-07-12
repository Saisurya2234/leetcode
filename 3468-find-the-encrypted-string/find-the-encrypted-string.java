class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch= s.charAt(i);
            int ans= (i + k) % n;
            char ch1 = s.charAt(ans);
            sb.append(ch1);
        }
        return sb.toString();
    }
}