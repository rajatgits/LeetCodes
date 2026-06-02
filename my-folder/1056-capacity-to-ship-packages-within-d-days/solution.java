class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int low = max;
        int high = sum;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(daysRequired(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int daysRequired(int[] weights, int capacity) {
        int day = 1;
        int total = 0;

        for(int i = 0; i < weights.length; i++) {
            if(total + weights[i] > capacity) {
                day += 1;
                total = weights[i];
            } else {
                total += weights[i];
            }
        }
        return day;
    }
}
