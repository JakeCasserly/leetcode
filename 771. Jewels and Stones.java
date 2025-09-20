import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Where n is the length of jewels and m is the length of stones
        // Time: O(n+m)
        // Space: O(n)
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        int jewelsLength = jewels.length();
        for (int i = 0; i < jewelsLength; i++) {
            set.add(jewels.charAt(i));
            //System.out.print(jewels.charAt(i));
        }
        int stonesLength = stones.length();
        for (int j = 0; j < stonesLength; j++) {
            if (set.contains(stones.charAt(j))) {
                count++;
            }
        }
        return count;
    }
}
