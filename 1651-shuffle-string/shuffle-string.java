class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        for (int i=0; i<indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
}