// check the discussion .there have the explaination to understand the problem
/**
1) if the charecter is '(' push the empty string 
2) else the character is ')'  adha pop() panitu reverse panitu adha append at peek;
3) suppose string ah iruntha direct ah peek la add pananum.

 */

class Solution {
    public String reverseParentheses(String s) {
        char[] s1 =s.toCharArray();
      
        Stack<StringBuilder> st = new Stack<StringBuilder>();
        st.push(new StringBuilder());
        for(char c:s1){
            if(c == '('){
                st.push(new StringBuilder());
            }
            else if(c == ')'){
                StringBuilder rev = st.pop().reverse();
                st.peek().append(rev);
            }
            else{
                st.peek().append(c);
            }
        }
        return st.pop().toString();

    }
}
