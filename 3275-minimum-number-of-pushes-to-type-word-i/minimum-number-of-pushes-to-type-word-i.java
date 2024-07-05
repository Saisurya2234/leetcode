  class Solution {
    public int minimumPushes(String word) {
     int n=word.length();
     if(n<=8){
        return n;
     }
     int sum=0;
     int i=1;
     while(n>8){
        n=n-8;
        sum=sum+i*8;
        i++;
     }
     return sum+n*i;
    }
}