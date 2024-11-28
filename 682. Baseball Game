class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int score = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                score = stack.get(stack.size()-1) + stack.get(stack.size()-2);
                stack.add(score);
            }
            else if (operations[i].equals("D")) {
                score = stack.get(stack.size()-1)*2;
                stack.add(score);
            }
            else if (operations[i].equals("C")) {
                stack.remove(stack.size()-1);
            }
            else if (Integer.valueOf(operations[i]) != 0 || operations[i].equals("0")) {     // is an integer
                score = Integer.valueOf(operations[i]);
                stack.add(score);
            }
        }
        int totalScore = 0;
        for (int i = 0; i < stack.size(); i++) {
            totalScore += stack.get(i);
        }
        return totalScore;
    }
}
