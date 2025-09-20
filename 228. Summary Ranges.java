import java.util.ArrayList;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> myList = new ArrayList<String>();
        if (nums.length > 1) {
            String startingNum = null;
            String currentNum = null;
            boolean alreadyStartedRange = false;
            for (int i = 0; i < nums.length; i++) {
                currentNum = Integer.toString(nums[i]);
                if (!alreadyStartedRange && i == nums.length-1) {
                    myList.add(Integer.toString(nums[i]));
                }
                else if (i == nums.length-1) {
                    String newString = startingNum + "->" + currentNum;
                    myList.add(newString);
                    break;
                }
                else {
                    if (nums[i+1] == nums[i]+1) {
                        if (!alreadyStartedRange) {
                            alreadyStartedRange = true;
                            startingNum = currentNum;
                        }
                    }
                    else {
                        if (!alreadyStartedRange) {
                            myList.add(currentNum);
                        }
                        else {
                            alreadyStartedRange = false;
                            String newString = startingNum + "->" + currentNum;
                            myList.add(newString);
                        }
                    }
                }
            }
            return myList;
        }
        else {
            if (nums.length == 0) {
                return myList;
            }
            myList.add(Integer.toString(nums[0]));
            return myList;
        }
    }
}
