class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(count > 0) {
                    sb.append('(');
                }
                count += 1;
            } else if(c == ')') {
                count -= 1;
                if(count > 0) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}
