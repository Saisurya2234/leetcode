class Solution {
    public int maxFrequencyElements(int[] a) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
            max=Math.max(map.get(a[i]),max);
        }
        for(Map.Entry<Integer, Integer> m:map.entrySet())  
        {  
            if(m.getValue()==max) ans+=m.getValue();   
        }  
        return ans;
    }
}