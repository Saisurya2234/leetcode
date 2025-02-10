// class Solution {
//     public boolean sumGame(String n) {

//         char[] c = n.toCharArray();
//         int d=0, q=0;
//         for(int i=0; i<c.length/2; i++){
//             if(c[i]=='?')q++;
//             else d-=c[i]-'0';
//         }
//         for(int i=c.length/2; i<c.length; i++){
//             if(c[i]=='?')
//             {d+=9; q++;
//             }
//             else d+=c[i]-'0';
//         }
//         if(q%2==1)return true;
//         if(q==0)return d!=0;
//         return d!=(q/2)*9;
//     }
// }
     
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

class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQuestion = 0, rightQuestion = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQuestion++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }
        
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQuestion++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }
        
        // Each '?' can be replaced with any digit from 0-9 optimally
        // Alice plays first, and she can always increase the imbalance if possible
        
        int diff = leftSum - rightSum;
        int questionDiff = leftQuestion - rightQuestion;
        
        // Each '?' contributes an expected value of 4.5 on average
        // However, Alice and Bob play optimally, so we assume worst-case optimal play
        // Each '?' in left contributes at most 9, and each '?' in right contributes at most 9
        // If the sum can be balanced, Bob wins; otherwise, Alice wins
        
        return (diff * 2 != -questionDiff * 9);
    }
}
