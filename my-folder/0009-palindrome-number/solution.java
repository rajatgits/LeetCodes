class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int duplicate = x;
        int rev = 0;
        while(duplicate != 0) {
            int rem = duplicate % 10;
            rev = rev * 10 + rem;
            duplicate /= 10;
        }
        return rev == x;
    }
}
