class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarry(nums, goal) - numSubarry(nums, goal - 1);
    }

    int numSubarry(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while(right < nums.length) {

            sum += nums[right];
    
            while(sum > goal && left <= right) {
                sum = sum - nums[left];
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
}
