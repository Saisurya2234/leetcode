class Solution {
    public int largestCombination(int[] c) {
        int n=c.length;
        int [] s=new int[32];
        for(int i=0;i<n;i++){
            for(int j=0;j<32;++j){
                int m=c[i]&(1<<j);
                if(m!=0){
                    s[j]+=1;
                }

            }
        }
        int a=0;
        for(int i=0;i<s.length;i++){
            a=Math.max(a,s[i]);
        }
        return a;

    }
}