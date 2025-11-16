class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(ans, new ArrayList<>(), 0, nums);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> list, int sIndex, int[] nums) {
        ans.add(new ArrayList<>(list));
        for(int i = sIndex; i < nums.length; i++) {
            if(i > sIndex && nums[i] == nums[i - 1]) {
                continue;
            }

            list.add(nums[i]);
            backtracking(ans, list, i + 1, nums);
            list.remove(list.size() - 1);
        }
    }
}
