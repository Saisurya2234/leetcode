class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int n=target.length;
        for(int i=0;i<n;i++){
          if(target[i]!=arr[i]){
            return false;
          }
        }
          return true; 
    }
}