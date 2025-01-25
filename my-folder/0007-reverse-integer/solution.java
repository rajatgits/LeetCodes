class Solution {
    public int reverse(int x) {
        int ans = 0;

        while(x != 0) {
            int rem = x % 10;
            int num = ans * 10 + rem;
            if((num - rem) / 10 !=  ans) {
                return 0;
            }
            ans = num;
            x /= 10;
        }
        return ans;
    }
}
