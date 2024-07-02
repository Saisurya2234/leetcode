class Solution {
    public int minPartitions(String n) {
        char ch[]=n.toCharArray();
        int max=Integer.MIN_VALUE;
        for(char c:ch){
            if(Integer.parseInt(String.valueOf(c))>max){
                max=Integer.parseInt(String.valueOf(c));
            }
        }
        return max;
        
    }
}