class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int count = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            count = Math.max(count, map.get(s.charAt(right)));

            if((right - left + 1) - count > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
