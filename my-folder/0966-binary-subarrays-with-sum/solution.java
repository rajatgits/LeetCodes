class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarray(nums, goal) - numSubarray(nums, goal - 1);
    }

    private int numSubarray(int[] nums, int goal) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum > goal && left <= right) {
                sum -= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
