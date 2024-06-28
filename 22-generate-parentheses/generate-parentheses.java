class Solution {
     public static List<String> generateParenthesisAns(String s, int open, int close, ArrayList<String> list){
        if(open==0 && close==0){
            list.add(s);
            return list;
        }

        if(open!=0){
            generateParenthesisAns(s+"(",open-1,close,list);
        }
        if(close>open){
            generateParenthesisAns(s+")",open,close-1,list);
        }

        return list;
    }
    
    public List<String> generateParenthesis(int n) {
       return generateParenthesisAns("",n,n,new ArrayList<>());
    }
}