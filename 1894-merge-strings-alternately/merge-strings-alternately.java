import java.util.Arrays;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;

        while (counter < word1.length() && counter < word2.length()) {
            builder.append(word1.charAt(counter));
            builder.append(word2.charAt(counter));
            counter++;
        }
        if (counter < word1.length()) {
            while (counter < word1.length()) {
                builder.append(word1.charAt(counter++));
            }
        } else if (counter < word2.length()) {
            while (counter < word2.length()) {
                builder.append(word2.charAt(counter++));
            }
        }

        return builder.toString();
    }
}