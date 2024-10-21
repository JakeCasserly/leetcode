class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(closest) > Math.abs(nums[i])) {
                closest = nums[i];
            }
        }

        for (int i = 1; i < nums.length; i++) { 
            if (Math.abs(closest)  == nums[i]) {
                return Math.abs(closest);
            }
        }

        return closest;
    }
}
