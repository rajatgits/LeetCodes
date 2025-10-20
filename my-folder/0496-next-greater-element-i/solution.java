class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums2) {
            while(!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int i = 0;
        for(int num : nums1) {
            ans[i++] = map.getOrDefault(num, -1);
        }
        return ans;
    }
}
