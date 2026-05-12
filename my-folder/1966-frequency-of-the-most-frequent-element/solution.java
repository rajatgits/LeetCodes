class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long max = 0;
        long sum = 0;

        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while((nums[right] * (right - left + 1L)) - sum > k) {
                sum -= nums[left];
                left++;
            }
            max = Math.max(max, right - left + 1L);
        }
        return (int) max;
    }
}
