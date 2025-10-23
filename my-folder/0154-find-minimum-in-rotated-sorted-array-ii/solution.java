class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int mid = -1;

        while(left <= right) {
            mid = left + (right - left)/2;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left = left + 1;
                right = right - 1;
                continue;
            }

            if(nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        min = Math.min(min, nums[mid]);
        return min;
    }
}
