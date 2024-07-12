class Solution {
    public int numberOfBeams(String[] bank) {
    ArrayList<Integer> list= new ArrayList<>();
    for(int i=0;i<bank.length;i++){
        String s=bank[i];
        int count =0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1'){
                count++;
            }
        }
        if(count>0){
            list.add(count);
        }
       
    }
    int ans=0;
    for(int i=0;i<list.size()-1;i++){
        ans=ans+ list.get(i) * list.get(i+1);
    }
    return ans;
    }
}