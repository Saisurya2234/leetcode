class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int prefix=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                prefix++;
            }
            else if(s.charAt(i)=='a' && prefix>0){
                prefix--;
                count++;
            }
        }
        return count;
        
    }
}