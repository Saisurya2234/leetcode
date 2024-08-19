class Solution {
    public int removeDuplicates(int[] nums) {

     
        if (nums.length <= 2) return nums.length;

        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

    //   HashMap<Integer,Integer> hm= new HashMap<>();
    //   for(int i:nums){
    //     if(hm.containsKey(i)){
    //         hm.put(i,hm.get(i)+1);
    //     }else{
    //         hm.put(i,1);
    //     }
    //   }
    //   for(int j:hm.keySet()){
    //     if(hm.get(j)>2){
    //         while(hm.get(j)!=2){
    //             hm.put(j,hm.get(j)-1);
    //         }
    //     }
    //   }
    //   int[] arr=new int[hm.size()];
    //   for(int i=0;i<hm.size();i++){
    //     arr[i]=hm.get(i);
    //   }
//     //   return arr.length;

//     }
// }