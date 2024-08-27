class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int width = right-left;
            area = Math.min(height[left],height[right])*width;
            max = Math.max(area,max);
            if(height[left]<height[right]) {
                left++;
                }
            else right--;
        }
        return max;
    }
}




// class Solution {
//     public int maxArea(int[] arr) {
//         int r=0;
//         int l=arr.length-1;
//         int res=0;
//         int ans=0;
//         int max=Integer.MIN_VALUE;
//         while(l<r){
//             int w=r-l;
//             ans=Math.min(arr[r],arr[l]);
//             res=ans*w;
//             max = Math.max(res,max);
//             if(arr[l]<arr[r]){
//                 l++;
//             }else{
//                 r--;
//             }
//         }
//         return max;   
//     }
// }