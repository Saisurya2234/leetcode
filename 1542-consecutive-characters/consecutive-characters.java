class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                max=Math.max(max,count);
            }else{
                count=1;
            }
        }
        return max;
        
    }
}