class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count=1;
        for(String s : arr){
            if(hashMap.containsKey(s)){
                hashMap.put(s,hashMap.get(s)+1);
            }else{
                hashMap.put(s,1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hashMap.get(arr[i]) == 1) {
                if(count == k) {
                    return arr[i];
                }else{
                    count++;
                }
            }
             
        }
        return "";

    }
}