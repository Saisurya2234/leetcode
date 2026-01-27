class Solution {
    public int countConsistentStrings(String str, String[] words) {
        int c=0;
        boolean [] isallow=new boolean[26];
        for(char ch: str.toCharArray()){
            isallow[ch-'a']=true;
        }

        for(String  s:words){
            boolean f=true;

            for(char ch:s.toCharArray()){
                if(!isallow[ch-'a']){
                    f=false;
                    break;

                }
            }
            if(f) c++;
        }
        return c;
       
        
    }
}