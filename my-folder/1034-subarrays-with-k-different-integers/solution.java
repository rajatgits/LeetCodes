class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarray(nums, k) - subarray(nums, k-1);
    }

    int subarray(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
    
        Map<Integer, Integer> map = new HashMap<>();

        while(r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l += 1;
            }
            count += (r-l+1);
            r += 1;
        }
        return count;
    }
}
