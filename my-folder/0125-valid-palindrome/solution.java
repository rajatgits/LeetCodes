class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
