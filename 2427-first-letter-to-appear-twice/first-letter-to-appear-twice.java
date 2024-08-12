class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> li= new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(li.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                li.add(s.charAt(i));
            }
        }
        return 'd';
        
        
    }
}