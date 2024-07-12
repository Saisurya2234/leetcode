class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        char priority;
        char not_priority;
        //Thawfeek logic
        if(x > y){
             priority = 'b';
             not_priority = 'a';
        }
        else{
            priority ='a';
            not_priority = 'b';
        }
        st.push(' ');
        int ans1 = 0;
        for(char ch:s.toCharArray()){
            if(ch == priority && st.peek()==not_priority){
                ans1 += max;
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        
        String str = "";
        while(!st.isEmpty()){
            str += st.pop();
        }
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        int ans2 = 0;
        Stack<Character> st2 = new Stack<>();
        char temp;
        temp = priority;
        priority = not_priority;
        not_priority = temp;
        st2.push(' ');
        for(char ch:str.toCharArray()){
           if(ch == priority && st2.peek()==not_priority){
                ans2 += min;
                st2.pop();
            }
            else{
                st2.push(ch);
            }
        }
        return ans1 + ans2;
    }
}