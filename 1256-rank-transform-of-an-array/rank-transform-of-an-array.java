class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int n:temp){
            if(!map.containsKey(n)){
                map.put(n,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;   
    }
}