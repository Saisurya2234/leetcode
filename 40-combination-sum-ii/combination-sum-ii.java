// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> li=new ArrayList<>();
//         int sum=0;
//         comb(0,candidates,target,li,new ArrayList<>(),sum);
//         return li;
//     }
//     public static void comb(int i,int[] arr,int target,List<List<Integer>> li,List<Integer> ans,int sum){
//         if(i==arr.length){
//             if(sum==target){
//                 li.add(new ArrayList<>(ans));
//             }
//             return;
//         }
//     if(arr[i]<=target){
//         ans.add(arr[i]); // pick
//         sum+=arr[i];// adding the sum to arr[i] because to check the sum with the target:
//         comb(i+1,arr,target,li,ans,sum);
//         ans.remove(ans.size()-1);// when the recursion call finish we should remove;
//         sum-=arr[i]; // for reducing the sum to check for not pick condition:
//     }
//         comb(i+1,arr,target,li,ans,sum); not pick
//     }   
        
// }
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        comb(0, candidates, target, resultSet, new ArrayList<>(), 0);
        return new ArrayList<>(resultSet); // Convert Set back to List
    }

    public void comb(int i, int[] arr, int target, Set<List<Integer>> resultSet, List<Integer> ans, int sum) {
        if (sum == target) {
            resultSet.add(new ArrayList<>(ans)); // Add combination to Set
            return;
        }
        if (i >= arr.length || sum > target) {
            return;
        }

        // Include the current number
        ans.add(arr[i]);
        comb(i + 1, arr, target, resultSet, ans, sum + arr[i]);
        ans.remove(ans.size() - 1);

        // Skip duplicates
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        comb(i + 1, arr, target, resultSet, ans, sum);
    }
}

