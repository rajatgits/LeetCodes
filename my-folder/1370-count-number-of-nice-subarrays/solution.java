class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return numSubarray(nums, k) - numSubarray(nums, k - 1);
    }

    private int numSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right] % 2;
            while(sum > k && left <= right) {
                sum -= nums[left] % 2;
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
