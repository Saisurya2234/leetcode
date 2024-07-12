class Solution {
    public int countAsterisks(String s) {
        int count=0;
        Boolean flag= false;
        for(char ch: s.toCharArray()){

            if(ch=='|'){
                if(flag==true){
                    flag=false;
                }else{
                flag=true;
            }
            }

            if(ch=='*' && flag==false){
                count++;
            }
        }
        return count;
        
    }
}