class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length()-1;

        while(i < j){
            if(c[i]<c[j]){
                c[j--] = c[i++];
            }else {
                c[i++] = c[j--];
            }
        }
        return new String(c);
    }
}