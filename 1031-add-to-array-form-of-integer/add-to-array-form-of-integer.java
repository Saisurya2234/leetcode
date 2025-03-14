import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        String s="";
        for(int n: num ){
            s+=n;
        }
        // long sum= Long.parseLong(s)+k;
        BigInteger bd= new BigInteger(s);
        BigInteger res= bd.add(new BigInteger(""+k));
        String r= res.toString();

        List<Integer> ls= new ArrayList<Integer>();

        for(int i=0;i<r.length();i++){
            ls.add(r.charAt(i)-'0');
        }

return ls;
    }
}