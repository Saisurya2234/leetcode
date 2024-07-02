class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("-")){
                x -= 1;
            }
            else{
                x += 1;
            }
        }
        return x;
    }
}