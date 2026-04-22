class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;

        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                index  = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for(int j = nums.length - 1; j >= 0; j--) {
            if(nums[j] > nums[index]) {
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums, index + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
