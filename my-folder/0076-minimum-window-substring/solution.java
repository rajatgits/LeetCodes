class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int sIndex = -1;
        int minLen = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if(map.get(s.charAt(right)) >= 0) {
                    count += 1;
                }
            }

            while(count == t.length()) {
                if((right - left + 1) < minLen) {
                    minLen = (right - left + 1);
                    sIndex = left;
                }

                if(map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if(map.get(s.charAt(left)) > 0) {
                        count -= 1;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(sIndex, sIndex + minLen);
    }
}
