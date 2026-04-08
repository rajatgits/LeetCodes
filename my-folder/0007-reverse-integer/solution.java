class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        int newNumber = Math.abs(x);
        int rev = 0;
        while(newNumber > 0) {
            int rem = newNumber % 10;
            if(rev > (Integer.MAX_VALUE - rem) / 10 && newNumber > 0)  {
                return 0;
            }

            if(rev < (Integer.MIN_VALUE - rem) / 10 && newNumber < 0)  {
                return 0;
            }
            rev = rev * 10 + rem;
            newNumber /= 10;
        }
        return isNegative ? -rev : rev;
    }
}
