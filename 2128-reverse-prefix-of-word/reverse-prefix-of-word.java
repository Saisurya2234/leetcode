class Solution {
    public String reversePrefix(String word, char ch) {
        int a=word.indexOf(ch);
        String s= word.substring(0,a+1);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        String ans=word.substring(a+1,word.length());
        return s+ans;

        
    }
}