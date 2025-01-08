class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }

                if(!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                } else if(stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                }
            }

        }
        
        int[] ans = new int[stack.size()];
        int k = stack.size() - 1;

        while(!stack.isEmpty()) {
            ans[k--] = stack.pop();
        }
        return ans;
    }
} 
