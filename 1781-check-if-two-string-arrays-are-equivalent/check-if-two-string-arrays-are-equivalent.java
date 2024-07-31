class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String s1="";
      for(String str:word1){
        s+=str;
      }
       for(String str1:word2){
        s1+=str1;
      }
        return s.equals(s1);
        
    }
}