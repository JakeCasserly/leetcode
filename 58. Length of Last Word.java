class Solution {
    public int lengthOfLastWord(String s) {
        //String a = s.substring(s.length-i, s.length);
        int index = 0;
        while (s.charAt(s.length()-index-1) == ' ') {
            index++;
        }
        int count = 0;
        String a = "";
        if (s.length() != 1) {
            a = s.substring(0, s.length()-index);
        }
        else {
            a = s;
        }
        index = 0;
        while (a.charAt(a.length()-index-1) != ' ') {
            count++;
            index++;
            if (a.length()-index-1 < 0) {
                return count;
            }
        }
        return count;
    }
}
