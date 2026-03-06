class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lMax = 0;
        int rMax = 0;
        int maxArea = 0;

        while(left < right) {
            if(height[left] <= height[right]) {
                if(lMax > height[left]) {
                    maxArea += (lMax - height[left]);
                } else {
                    lMax = height[left];
                }
                left++;
            } else {
                if(rMax > height[right]) {
                    maxArea += (rMax - height[right]);
                } else {
                    rMax = height[right];
                }
                right--;
            }
        }
        return maxArea;
    }
}
