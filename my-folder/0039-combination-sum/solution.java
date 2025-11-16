class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        targetSum(ans, new ArrayList<>(), 0, candidates, target);
        return ans;
    }
    
    private void targetSum(List<List<Integer>> ans, List<Integer> list, int index, int[] candidates, int target) {
        if(index == candidates.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(candidates[index] <= target) {
            list.add(candidates[index]);
            targetSum(ans, list, index, candidates, target - candidates[index]);
            list.remove(list.size() - 1);
        }
        targetSum(ans, list, index + 1, candidates, target);
    }
}
