class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), i);
            }

            if(!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), i);
            }

            if(!sMap.get(s.charAt(i)).equals(tMap.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
