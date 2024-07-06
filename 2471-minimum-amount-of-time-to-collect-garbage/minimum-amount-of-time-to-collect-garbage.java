class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int gar[]=new int[3];
        int last[]=new int[3];
        for(int i=0;i<garbage.length;i++){
            String a=garbage[i];
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='M'){ gar[0]++; last[0]=i;}
                if(a.charAt(j)=='G') {gar[1]++; last[1]=i;}
                if(a.charAt(j)=='P'){ gar[2]++; last[2]=i;}
            }
        }
        int ans=0;
        for(int i=0;i<travel.length;i++){
           if(last[0]>i) ans+=travel[i];
           if(last[1]>i) ans+=travel[i];
           if(last[2]>i) ans+=travel[i];
        }
        ans+=gar[0]+gar[1]+gar[2];
        return ans;
    }
}