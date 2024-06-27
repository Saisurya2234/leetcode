class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> smallSet = new HashSet<>();
        Set<Character> capitalSet = new HashSet<>();
        
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                smallSet.add(c);
            } else {
                capitalSet.add(c);
            }
        }
        
        int count = 0;
        for (char c : smallSet) {
            if (capitalSet.contains(Character.toUpperCase(c))) {
                count++;
            }
        }
        
        return count;
    }
}