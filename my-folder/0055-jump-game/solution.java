class Solution {
    public boolean canJump(int[] nums) {
        int ans = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] + i >= ans) {
                ans = i;
            }
        }
        return ans == 0;
    }
}
