class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashMap<String,Integer> hp1 = new HashMap<>();
        HashMap<String,Integer> hp2 = new HashMap<>();

        for(int i=0; i<n1; i++){
            hp1.put(arr1[i],hp1.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0; i<n2; i++){
            hp2.put(arr2[i],hp2.getOrDefault(arr2[i],0)+1);
        }

        HashSet<String> hp = new HashSet<>();
        for(var a : hp1.keySet()){
            if(hp1.get(a)==1){
                if(!hp2.containsKey(a)) hp.add(a);
            }
        }

        for(var a : hp2.keySet()){
            if(hp2.get(a)==1){
                if(!hp1.containsKey(a)) hp.add(a);
            }
        }

        String ans[] = new String[hp.size()];
        int idx = 0;
        for(var a : hp) ans[idx++] = a;
        return ans;
    }
}