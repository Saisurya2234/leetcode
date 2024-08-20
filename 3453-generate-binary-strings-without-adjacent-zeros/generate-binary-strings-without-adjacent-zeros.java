class Solution {
    public List<String> validStrings(int n) { 
        List<String> li=new ArrayList<>();
        bs("",n,li);
        return li;

    }
    public static void bs(String s,int n,List<String> li){
        if(n==0){
            li.add(s);
            return ;
        }
        bs(s+"1",n-1,li);
        if(s.isEmpty() || s.charAt(s.length()-1)!='0'){
            bs(s+"0",n-1,li);
        }
    }
}