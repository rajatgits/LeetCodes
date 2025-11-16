class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        targetSum(ans, new ArrayList<>(), 0, target, candidates);
        return ans;
    }

    private void targetSum(List<List<Integer>> ans, List<Integer> list, int index, int target, int[] candidates) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i] > target) {
                break;
            }

            list.add(candidates[i]);
            targetSum(ans, list, i + 1, target - candidates[i], candidates);
            list.remove(list.size() - 1);
        }
    }
}
