class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while(r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            if(map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l += 1;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r += 1;
        }
        return maxLen;
    }
}
