class Solution {
    public String interpret(String s) {
        String ans="";
        s=s.replace("()","o");
         for(char ch:s.toCharArray()){
            if(ch=='('|| ch==')'){
                continue;
            }else{
                ans+= ch;
            }
         }
         return ans;
        }
      
    }
