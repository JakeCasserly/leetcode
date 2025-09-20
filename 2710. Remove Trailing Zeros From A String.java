class Solution {
    public String removeTrailingZeros(String num) {
        String[] digits = num.split("");
        int i = 1;
        while (digits[digits.length-i++].equals("0")) {
            num = num.substring(0,num.length()-1);
            
        }
        return num;
    }
}
