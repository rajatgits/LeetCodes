class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String str : strs) {
            int[] hash = new int[26];
            for(char c : str.toCharArray()) {
                hash[c - 'a']++;
            }
            String strKey = Arrays.toString(hash);
            ans.putIfAbsent(strKey, new ArrayList<>());
            ans.get(strKey).add(str);
        }
        return new ArrayList<>(ans.values());
    }
}
