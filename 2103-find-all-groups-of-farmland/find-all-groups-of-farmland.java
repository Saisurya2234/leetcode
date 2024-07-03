class Solution { 
    int c=0;
    int d=0;
    public void dfs(int a[][],int i, int j) {
        int n=a.length;
        int m=a[0].length; 
        if(i<0 || i>=n || j<0 || j>=m || a[i][j]==0) {
            return;
        }
        a[i][j]=0;
        c=Math.max(i,c);
        d=Math.max(j,d);
        dfs(a,i+1,j);
        dfs(a,i,j+1);
    }
    public int[][] findFarmland(int[][] land) {
        int n=land.length;
        int m=land[0].length; 
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(land[i][j]==1) {
                    int a=i,b=j;
                    dfs(land,i,j);
                    l.add(new int[]{a,b,c,d});
                    c=0;
                    d=0;
                }
            }
        }
         return l.toArray(new int[l.size()][]);
    }
}