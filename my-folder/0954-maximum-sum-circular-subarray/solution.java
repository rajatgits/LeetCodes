class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int currMin = 0;
        int currMax = 0;
        int maxSum = nums[0];
        int minSum  = nums[0];

        for(int num : nums) {
            currMin = Math.min(currMin, 0) + num;
            minSum = Math.min(minSum, currMin);

            currMax = Math.max(currMax, 0) + num;
            maxSum = Math.max(maxSum, currMax);

            sum += num;
        }

        if(sum == minSum) {
            return maxSum;
        }

        return Math.max(maxSum, sum - minSum);
    }
}
