class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        int push = 1;
        int j = 0;

        int[] al = new int[26];

        for(int i = 0;i<n;i++){
            al[word.charAt(i) - 'a']++;
        }

        Arrays.sort(al);

        int i = 25;
        while(i>=0 && al[i] != 0){
            ans += al[i] * push;
            j++;
            if(j == 8){
                push++;
                j = 0;
            }
            i--;
        }

        return ans;
    }
}
