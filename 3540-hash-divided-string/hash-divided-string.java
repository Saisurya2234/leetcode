class Solution {
    public String stringHash(String s, int k) {
        String ans ="";
        int n = s.length();
        int  i = 0;
        while(i < n){
            int tot = 0;
            for(int j = i;j<Math.min(i+k,n);j++){
                tot += s.charAt(j) - 'a';
            }
            tot = tot % 26;// Keep the sum within 'a' to 'z'
            ans += (char)(tot + 'a'); 
            i += k;
        }
        return ans;
       
    }
}
