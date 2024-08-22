class Solution {
    public int findComplement(int num) {
        
        String s=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }else{
                sb.setCharAt(i,'1');
            }
        }
        return Integer.parseInt(sb.toString(),2);

        
    }
}