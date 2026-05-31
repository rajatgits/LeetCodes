class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for(int num : piles) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(totalHours(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int totalHours(int[] nums, int h) {
        int total = 0;

        for(int i = 0; i < nums.length; i++) {
            total += Math.ceil((double)nums[i]/h);
        }
        return total;
    }
}
