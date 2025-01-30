class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sIndexMap = new HashMap<>();
        HashMap<Character, Integer> tIndexMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!sIndexMap.containsKey(s.charAt(i))) {
                sIndexMap.put(s.charAt(i), i);
            }

            if(!tIndexMap.containsKey(t.charAt(i))) {
                tIndexMap.put(t.charAt(i), i);
            }

            if(!sIndexMap.get(s.charAt(i)).equals(tIndexMap.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
