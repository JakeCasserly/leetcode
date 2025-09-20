class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length-1];
        if (lastDigit != 9) {
            digits[digits.length-1] = lastDigit+1;
            return digits;
        }
        digits[digits.length-1] = 0;
        int digitsCovered = 1;
        boolean carrySet = true;
        while (carrySet) {
            if (digits.length > digitsCovered) {
                int nextDigit = digits[digits.length-digitsCovered-1];
                if (nextDigit != 9) {
                    digits[digits.length-digitsCovered-1] += 1;
                    return digits;
                }
                else {
                    digits[digits.length-digitsCovered-1] = 0;
                    digitsCovered++;
                }
            }
            else {
                int[] returnDigits = new int[digits.length+1];
                returnDigits[0] = 1;
                for (int i = 1; i < returnDigits.length; i++) {
                    returnDigits[i] = digits[i-1];
                }
                digits = returnDigits;
                carrySet = false;
            }
        }
        return digits;
    }
}
