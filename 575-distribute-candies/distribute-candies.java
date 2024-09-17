class Solution {
    public int distributeCandies(int[] candyType) {
        int total=candyType.length;
        int take=total/2;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<total;i++){
            hs.add(candyType[i]);
        }
        if(hs.size()<=take){
            return hs.size();
        }
        return take;

      
        
    }
}