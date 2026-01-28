class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int mid=n/2;
        String s1="";
        String s2="";
        for(int i=0;i<mid;i++){
            s1+=s.charAt(i);
            
        }
        for(int i=mid;i<n;i++){
           s2+=s.charAt(i);
        }
        int c1=isvowel(s1);
        int c2=isvowel(s2);

        if(c1==c2){
            return true;
        }
        return false;

    }
    int isvowel(String s){
        int c=0;
       String vowel="AEIOUaeiou";
       for(char ch: s.toCharArray()){
            if(vowel.contains(String.valueOf(ch))){
                 c++;
            }
       }
       return c;
    }
}