class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb= new StringBuilder(num);

        while(sb.length()!=0 && sb.charAt(sb.length()-1)=='0'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
       
        
    }
}