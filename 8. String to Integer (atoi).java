class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        long result = 0;
        if (sb.length() == 0) {
            return 0;
        }
        boolean negative = false;
        int index = 0;
        while (index < sb.length() && sb.charAt(index) == ' ') {
            index++;
        }
        if (index > 0) {
            sb.delete(0, index);
        }
        if (sb.charAt(0) == '-' || sb.charAt(0) == '+') {
            negative = sb.charAt(0) == '-';
            index++;
        }
        while (index < sb.length()) {
            char currentChar = sb.charAt(index);

            if (currentChar < '0' || currentChar > '9') {
                break;
            }
            result = (result * 10) + (currentChar - '0');

            if (result > Integer.MAX_VALUE) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            index++;
        }
        return (int)((negative) ? -result : result);
    }
}
