class Solution {
    public boolean check(int[] nums) {
       int irregular = 0;

       for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % nums.length]) {
                irregular++;
            }
       }
       return irregular > 1 ? false : true;
    }
}
