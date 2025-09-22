#include <cmath>
class Solution {
public:
    int findMin(vector<int>& nums) {
        long l = 0;
        long r = nums.size()-1;

        while (l < r) {
            long middle = l + (r-l)/2;
            if (nums[middle] > nums[r]) {
                l = middle + 1;
            }
            else {
                r = middle;
            }
        }

        return nums[l];
    }
};
