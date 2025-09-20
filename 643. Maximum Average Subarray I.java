class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = k-1;
        double currentSum = 0;
        double maxAvg = 0;

        // do first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxAvg = currentSum/k;

        // slide the window
        while (end < nums.length-1) {
            currentSum += -nums[start] + nums[end+1];
            if (currentSum/k > maxAvg) {
                maxAvg = currentSum/k;
            }
            start++;
            end++;
        }
        return maxAvg;
    }
}
