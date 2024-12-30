class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for(int num : nums) {
            right = Math.max(right, num);
        }

        while(left <= right) {
            int mid = left+(right-left)/2;
            if(sumDivisor(nums, mid) > threshold) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }

    private int sumDivisor(int[] nums, int mid) {
        int sum = 0;
        for(int num : nums) {
            sum += Math.ceil((double)num/(double)mid);
        }
        return sum;
    }
}
