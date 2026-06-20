class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 2 * nums.length; i++) {
            while(!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]) {
                int index = stack.pop();
                ans[index] = nums[i % nums.length];
            }
            if(i < nums.length) {
                stack.push(i % nums.length);
            }
        }
        return ans;
    }
}
