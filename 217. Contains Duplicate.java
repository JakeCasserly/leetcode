class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++){
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
