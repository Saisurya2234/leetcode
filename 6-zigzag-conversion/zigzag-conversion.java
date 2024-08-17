class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int a=0;
        int m=numRows;
        boolean flag=false;
        for(char c:s.toCharArray()){
            sb[a].append(c);
            if(a==0|| a==m-1){
                flag=!flag;
            }
            if(flag){
                a=a+1;
            }else{
                a=a-1;
            }
        }
        StringBuilder sd=new StringBuilder();
        for(StringBuilder str:sb){
            sd.append(str);
        }
        return sd.toString();
        
        
    }
}