class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                count++;
            }

            if(count > k) {
                if(nums[left] == 0) {
                    count--;
                }  
                left++;
            }

            if(count <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
