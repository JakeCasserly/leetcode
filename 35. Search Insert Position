#include <math.h>

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size()-1;
        int currentIndex = 0;

        while (left <= right) {
            currentIndex = floor((left+right)/2);
            if (nums[currentIndex] == target) {
                return currentIndex;
            }
            else if (nums[currentIndex] < target) {
                left = currentIndex + 1;
            }
            else {
                right = currentIndex - 1;
            }
        }
        
        if (nums[currentIndex] < target) {
            return currentIndex + 1;
        }
        else {
            return currentIndex;
        }
    }
};
