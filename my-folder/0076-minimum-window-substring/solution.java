class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(int end=0; end<s.length(); end++) {
            if(map.containsKey(s.charAt(end))) {
                map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
                if(map.get(s.charAt(end)) >= 0) {
                    count++;
                } 
            } 
            
            while(count == t.length()) {
                if(end-start+1 < minLen) {
                    minLen = end-start+1;
                    sIndex = start;
                }

                if(map.containsKey(s.charAt(start))) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    if(map.get(s.charAt(start)) > 0) {
                        count--;
                    }
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(sIndex, sIndex+minLen);
    }
}
