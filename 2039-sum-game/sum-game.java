class Solution {
    public boolean sumGame(String n) {

        char[] c = n.toCharArray();
        int d=0, q=0;
        for(int i=0; i<c.length/2; i++){
            if(c[i]=='?')q++;
            else d-=c[i]-'0';
        }
        for(int i=c.length/2; i<c.length; i++){
            if(c[i]=='?')
            {d+=9; q++;
            }
            else d+=c[i]-'0';
        }
        if(q%2==1)return true;
        if(q==0)return d!=0;
        return d!=(q/2)*9;
    }
}
     
        // int n = num.length();
        
        // int leftSum = 0, rightSum = 0;
        
        // int leftQuestionCount = 0, rightQuestionCount = 0;
        
        // for (int i = 0; i < n / 2; i++) {
        //     char ch = num.charAt(i);
        //     if (ch == '?') {
        //         leftQuestionCount++; 
        //         leftSum += 9; 
        //     } else {
        //         leftSum += ch - '0'; 
        //     }
        // }
        
      
        // for (int i = n / 2; i < n; i++) {
        //     char ch = num.charAt(i);
        //     if (ch == '?') {
        //         rightQuestionCount++;
        //         rightSum += 9; 
        //     } else {
        //         rightSum += ch - '0'; 
        //     }
        // }
        
       
        // return leftSum == rightSum;

