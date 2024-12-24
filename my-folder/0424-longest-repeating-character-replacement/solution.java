class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFreq = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            if((right - left + 1) - maxFreq > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
