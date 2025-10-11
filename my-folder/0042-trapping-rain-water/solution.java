class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int total = 0;
        int maxLeft = height[left];
        int maxRight = height[right];

        while(left < right) {
            if(height[left] < height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);

                if(maxLeft - height[left] > 0){
                    total += (maxLeft - height[left]);
                }
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);

                if(maxRight - height[right] > 0) {
                    total += (maxRight - height[right]);
                }
                right--;
            }
        }
        return total;
    }
}
