class Solution {
    public int heightChecker(int[] heights) {

        int[] sai=heights.clone();
        int count=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sai[i]){
                count++; 
            }
        }
        return count;
        
    }
}