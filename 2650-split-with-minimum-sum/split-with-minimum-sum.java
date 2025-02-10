class Solution {
    public int splitNum(int num) {
        int sum=0;
        String s=Integer.toString(num);
        int[]arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=Integer.parseInt(s.charAt(i)+"");
        }
        Arrays.sort(arr);
        String s1="";
        String s2="";
        for(int i=0;i<arr.length;i++){
            if(i %2 ==0){
                s1+=arr[i]+"";
            }
            else{
                s2+=arr[i]+"";
            }
        }
        int res=Integer.parseInt(s1);
        int res2=Integer.parseInt(s2);
        return res+res2;
        
        
        
        
        

        
        
        
    }
}