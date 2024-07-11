class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rightMax = -1; 
        for (int i = n-1; i >= 0; i--) { 
            int temp = arr[i]; // hold the arr[i] 
            arr[i] = rightMax; // updating current index to hold right max value
            rightMax = Math.max(rightMax, temp);
        }
        return arr;
    }
}