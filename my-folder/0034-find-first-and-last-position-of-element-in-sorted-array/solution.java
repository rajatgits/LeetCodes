class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        if(first == -1) {
            return new int[]{-1, -1};
        }
        int last = lastOccurence(nums, target);
        return new int[]{first, last};
    }

    private int firstOccurence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private int lastOccurence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}
