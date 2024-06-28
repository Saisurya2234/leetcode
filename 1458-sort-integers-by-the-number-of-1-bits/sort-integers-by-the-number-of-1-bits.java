class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int bitCount=Integer.bitCount(arr[i]);
            arr[i]+=bitCount*100000;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;++i){
            arr[i]%=100000;
        }
        return arr;
    }
}