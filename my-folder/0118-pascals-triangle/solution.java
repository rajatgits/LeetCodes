class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            ans.add(generateList(i));
        }
        return ans;
    }

    private List<Integer> generateList(int row) {
        List<Integer> ans = new ArrayList<>();
        int res = 1;
        ans.add(1);
        for(int i = 1; i < row; i++) {
            res *= (row - i);
            res /= i;
            ans.add(res);
        } 
        return ans;
    }
}
