class Solution 
{
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) 
    {
    int left=Math.max(rec1[0],rec2[0]);
    int right=Math.min(rec1[2],rec2[2]);
    int top=Math.min(rec1[3],rec2[3]);
    int bottom=Math.max(rec1[1],rec2[1]);
    if(right>left&&top>bottom)
    return true;
    else
    return false;        
    }
}