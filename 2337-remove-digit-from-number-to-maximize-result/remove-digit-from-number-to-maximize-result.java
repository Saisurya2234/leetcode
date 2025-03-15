class Solution {
    public String removeDigit(String n, char digit) {
        String maxResult = "";
        
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == digit) {
                String newString = n.substring(0, i) + n.substring(i + 1);
                if (newString.compareTo(maxResult) > 0) {
                    maxResult = newString;
                }
            }
        }
        
        return maxResult;
    }
}
