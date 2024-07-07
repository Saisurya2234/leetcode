class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
       long childPick=0;
       int pick=0;
       for(int i=happiness.length-1;i>=0;i--)
       {
            if(pick<k && happiness[i]>0)
            {
                happiness[i]=happiness[i]-pick;
                if(happiness[i]>0){
                childPick+=happiness[i];
                pick++;
                }
            }
            else{
                break;
            }
       }
       return childPick;
    }
}