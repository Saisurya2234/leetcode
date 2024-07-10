class Solution {
    public String reverseWords(String s) {
        String[] arr= s.split(" ");
        String d="";
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(arr[i]);
            sb.reverse();
            d+=sb.toString()+" ";
        }
       return d.trim(); 
    }
}