class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans; 
    }

    private List<Integer> generateRow(int row) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int res = 1;
        for(int i = 0; i < row; i++) {
            res *= (row - i);
            res /= (i + 1);
            ans.add(res);
        }
        return ans;
    }
}
