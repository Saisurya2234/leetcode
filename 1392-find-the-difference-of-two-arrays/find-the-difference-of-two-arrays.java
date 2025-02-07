class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<List<Integer>> li = new ArrayList<>();
        Set<Integer> ans = new HashSet<>(); 
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

      
        for (int a : nums1) s1.add(a);
        for (int b : nums2) s2.add(b);

       
        for (int i : nums1) {
            if (!s2.contains(i)) {
                ans.add(i);  
            }
        }

     
        for (int j : nums2) {
            if (!s1.contains(j)) {
                ans1.add(j); 
            }
        }

      
        li.add(new ArrayList<>(ans));   
        li.add(new ArrayList<>(ans1));   

        return li;

        

        
        
    }
}