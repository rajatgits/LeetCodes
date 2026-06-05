class Solution {
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        int low = max;
        int high = sum;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(countSubarry(nums, mid) > k) {
               low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int countSubarry(int[] nums, int mid) {
        int cnt = 1;
        int sumSubarray = 0;

        for(int i = 0; i < nums.length; i++) {
            if(sumSubarray + nums[i] <= mid) {
                sumSubarray += nums[i];
            } else {
                cnt++;
                sumSubarray = nums[i];
            }
        }
        return cnt;
    }
}
