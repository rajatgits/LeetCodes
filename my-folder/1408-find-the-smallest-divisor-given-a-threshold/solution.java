class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(result(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int result(int[] nums, int mid) {
        int total = 0;

        for(int i = 0; i < nums.length; i++) {
            total += Math.ceil((double)nums[i]/mid);
        }
        return total;
    }
}
