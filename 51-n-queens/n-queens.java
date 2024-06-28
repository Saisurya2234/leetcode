class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        boolean[][] board=new boolean[n][n];
        List<String>ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();

        queens(board,n,0,ll,ans);
        return ans;
        
    }

    public static void queens(boolean[][]board,int Q,int row,List<String>ll,List<List<String>>ans)
    {
        if(Q==0)
        {
            for(int i=0;i<board.length;i++)
            {
                String s="";
                for(int j=0;j<board.length;j++)
                {
                    if(board[i][j])
                        s=s+'Q';
                    else
                        s+='.';
                }
                ll.add(s);
            }
            ans.add(new ArrayList<>(ll));
            ll.clear();
            return;

        }

        for(int col=0;col<board.length;col++)
        {
            if(possible(board,row,col))
            {
                board[row][col]=true;
                queens(board, Q-1, row+1,ll,ans);
                board[row][col]=false;
            }
        }
    }
    public static boolean possible(boolean[][]board,int row,int col)
    {
        int r=row;
        while(r>=0)
        {
            if(board[r][col])
                return false;
            r--;
        }
        r=row;
        int c=col;

        while(r>=0 && c>=0)
        {
            if(board[r][c])
                return false;
            r--;
            c--;
        }

        r=row;
        c=col;

        while(r>=0 && c<board.length)
        {
            if(board[r][c])
                return false;
            r--;
            c++;

        }
        return true;
    }

}