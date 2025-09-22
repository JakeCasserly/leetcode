class Solution {
public:
    bool isPerfectSquare(int num) {
        long l = 0;
        long r = num;

        while (l <= r) {
            long m = (l+r)/2;
            long rw = m*m;
            if (rw == num) {
                return true;
            }
            else if (rw < num) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return false;
    }
};
