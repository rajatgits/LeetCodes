class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(ans, new ArrayList<>(), nums);
        return ans;
    }

    private void permutations(List<List<Integer>> ans, List<Integer> list, int[] nums) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                continue;
            }

            list.add(nums[i]);
            permutations(ans, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
