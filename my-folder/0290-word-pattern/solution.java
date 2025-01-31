class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> patternMap = new HashMap<>();
        String[] str = s.split(" ");
        Map<String, Integer> strMap = new HashMap<>();

        if(pattern.length() != str.length) {
            return false;
        }

        for(int i = 0; i < pattern.length(); i++) {
            if(!patternMap.containsKey(pattern.charAt(i))) {
                patternMap.put(pattern.charAt(i), i);
            }

            if(!strMap.containsKey(str[i])) {
                strMap.put(str[i], i);
            }

            if(!patternMap.get(pattern.charAt(i)).equals(strMap.get(str[i]))) {
                return false;
            }
        }
        return true;
    }
}
