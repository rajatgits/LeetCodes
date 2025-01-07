class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 2*nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[i % nums.length] >= stack.peek()) {
                stack.pop();
            }
            if(i < nums.length) {
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i % nums.length]);
        }
        return ans;
    }
}
