class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0,c1=0,c2=0;
        for(char m:moves.toCharArray())
        {
            if(m=='L')
            {
                c1++;
            }
            else if(m=='R')
            {
                c2++;
            }
            else
            {
                c++;
            }
        }
        return Math.max(c1,c2)-Math.min(c1,c2)+c;
    }
}