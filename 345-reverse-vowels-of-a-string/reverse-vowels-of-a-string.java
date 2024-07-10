class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
               char[] charArray = s.toCharArray();
    
    while (i < j) {
        if (set.contains(charArray[i]) && set.contains(charArray[j])) {
           
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
            }else if(set.contains(s.charAt(i)) && !set.contains(s.charAt(j))){
                j--;
            }else if(!set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
               i++;
            }else{
                i++;
                j--;
            }  
        }
        return new String(charArray);
    }
}