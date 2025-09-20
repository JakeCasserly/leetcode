class Solution {
    public static int divide(int dividend, int divisor) {
        long dividendLeft = Math.abs((long)dividend);
        int quotient = 0;
        long trueDivisor = Math.abs((long)divisor);
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (trueDivisor == 1) return dividend * divisor;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        while (dividendLeft >= trueDivisor) {
            long base = trueDivisor;
            int x = 1;
            while (base <= (dividendLeft >> 1)){
                base <<= 1;
                x <<= 1;
            }
            dividendLeft -= base;
            quotient += x;
        }
        if (!isNegative) {
            return quotient;
        }
        else {
            return -quotient;
        }
    }
}
