class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.add(bracket);
            }
            else if (stack.size() > 0) {
                char stackRes = stack.remove(stack.size()-1);
                if (bracket == ')' && stackRes == '(') {
                    continue;
                }
                else if (bracket == '}' && stackRes == '{') {
                    continue;
                }
                else if (bracket == ']' && stackRes == '[') {
                    continue;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}
