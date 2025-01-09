class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int nse = -1;
        int pse = -1;
        int heightElement = -1;
        
        for(int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                heightElement = stack.peek();
                stack.pop();

                nse = i;
                pse = stack.isEmpty() ? -1 : stack.peek();

                maxArea = Math.max(maxArea, heights[heightElement] * (nse - pse - 1));
            }
            stack.push(i); 
        }
        while(!stack.isEmpty()) {
            heightElement = stack.peek();
            stack.pop();
            nse = heights.length;
            pse = stack.isEmpty() ? -1 : stack.peek();
            maxArea = Math.max(maxArea, heights[heightElement] * (nse - pse - 1));
        }
        return maxArea;
    }
}
