class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            hm.put(nums[i], i);
        }
        for (int j = 0; j < length; j++ ){
            int diff = target - nums[j];
            if (hm.get(diff) != null) {
                int index = hm.get(diff);
                if (index != j) {
                    ans[0] = j;
                    ans[1] = index;
                    return ans;
                }
            }
        }
        return ans;
    }
}
