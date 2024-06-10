class Solution {
    public int findComplement(int num) {
        if (num == 1) {
            return 0;
        }
        int n = 0;
        int newnum = num;
        while (newnum / 2 > 0) {
            newnum /= 2;
            n++;
        }
        System.out.println(n);
        long power = ((long)Math.pow(2,n+1)) - 1;
        System.out.println(power);
        return ((int)power ^ num);
    }
}
