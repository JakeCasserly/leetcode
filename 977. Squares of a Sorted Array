class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] squared = new int[length];
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = 0;
        for (int i = 0; i < length; i++) {
            n = nums[i];
            squared[i] = n*n;
        }
        int p1 = 0;                     // the pointer
        int p2 = length-1;
        int pointed1 = squared[p1];      // the value that is pointed at
        int pointed2 = squared[p2];
        while(p2 >= p1) {
            pointed1 = squared[p1];
            pointed2 = squared[p2];
            if (pointed2 >= pointed1) {
                result.add(pointed2);
                p2--;
            }
            else {
                result.add(pointed1);
                p1++;
            }
        }
        Collections.reverse(result);               // Also takes up O(n) time
        for(int l = 0; l < length; l++) {
            squared[l] = result.get(l);
        }
        return squared;
    }
}
