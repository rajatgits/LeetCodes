class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int near = 0;
        int far = 0;

        while(far < nums.length - 1) {
            int max = 0;
            for(int i = near; i <= far; i++) {
                max = Math.max(max, nums[i] + i);
            }
            near = far + 1;
            far = max;
            ans++;
        }
        return ans;
    }
}
