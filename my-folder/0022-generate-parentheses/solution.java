class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, 0, 0, "", n);
        return list;
    }

    private void helper(List<String> list, int left, int right, String str, int n) {
        if(str.length() == n * 2) {
            list.add(str);
            return;
        }

        if(left < n) {
            helper(list, left + 1, right, str + "(", n);
        } 

        if(right < left) {
            helper(list, left, right + 1, str + ")", n);
        }
    }
}
