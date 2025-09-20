class Solution {
    public String mergeAlternately(String word1, String word2) {
        int totalLength = word1.length() + word2.length();
        String merged = "";
        for (int i = 0; i < totalLength; i++) {
            if (i < word1.length()) {
                merged += word1.charAt(i);
            }
            if (i < word2.length()) {
                merged += word2.charAt(i);
            }
        }
        return merged;
    }
}
