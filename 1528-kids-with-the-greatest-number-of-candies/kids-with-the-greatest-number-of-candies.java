class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int sum=0;
        ArrayList<Boolean> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]>sum){
                sum=candies[i];
            }
        }
        for(int i=0;i<n;i++){
         boolean ans=candies[i]+extraCandies>=sum;
         li.add(ans);
        }
        return li;

        
    }
}