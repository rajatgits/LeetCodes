class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() >= needle.length()) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
