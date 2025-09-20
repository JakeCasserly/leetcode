class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerosCount = 0;
        int L = 0;
        int maxW = 0;
        // R - L + 1 = window_size

        for (int R = 0; R < nums.length; R++) {
            if (nums[R] == 0) {
                zerosCount++;
            }
            while (zerosCount > k) {
                if (nums[L] == 0) { 
                    zerosCount--;
                }
                L++;
            }

            int width = R - L + 1;

            if (width > maxW) {
                maxW = width;
            }
        }

        return maxW;
    }
}
