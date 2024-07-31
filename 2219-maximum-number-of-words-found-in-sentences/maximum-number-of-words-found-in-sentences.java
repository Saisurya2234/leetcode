class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String s:sentences){
            String[] s1=s.split(" ");
            max = Math.max(max,s1.length);
        }
        return max;
    }
}