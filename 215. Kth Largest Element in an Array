import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(nums.length);


        for (int i = 0; i < nums.length; i++) {
            pQueue.add(nums[i]);
        }

        for (int i = 0; i < k-1; i++) {
            pQueue.poll();
        }

        return -pQueue.poll();
    }
}
