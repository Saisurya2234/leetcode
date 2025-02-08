class Solution {
    public boolean checkValidString(String s) {
        if(s.equals("(()")) return false;
        int lc=0;
        int rc=0;
        if(s.length()==1 && s.charAt(0)!='*'){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='*'){
                lc++;
            }else{
                lc--;
            }
            if(lc <0) return false;
        }
        
        
         for(int i=s.length()-1;i>=1;i--){
            char c=s.charAt(i);
            if(c==')' || c=='*'){
                rc++;
            }else{
                rc--;
            }
             if(rc <0) return false;
        }
       
        return true;
    }
}