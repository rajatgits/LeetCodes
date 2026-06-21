class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = nSE(arr);
        int[] psee = pSEE(arr);
        int total = 0;
        int mod = (int)1e9 + 7;

        for(int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;
            total = (int) ((total + (freq % mod) * arr[i]) % mod);
        }
        return total;
    }

    private int[] nSE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] pSEE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
