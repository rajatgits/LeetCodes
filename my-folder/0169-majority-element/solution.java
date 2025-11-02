class Solution {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if(count == 0) {
                count++;
                num = nums[i];
            } else if(num == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
}
