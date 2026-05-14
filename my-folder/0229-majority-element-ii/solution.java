class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(cnt1 == 0 && nums[i] != element2) {
                cnt1 = 1;
                element1 = nums[i];
            } else if(cnt2 == 0 && nums[i] != element1) {
                cnt2 = 1;
                element2 = nums[i];
            } else if(element1 == nums[i]) {
                cnt1++;
            } else if(element2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == element1) {
                count1++;
            }

            if(nums[i] == element2) {
                count2++;
            }
        }

        int min = (int)(nums.length / 3) + 1;

        if(count1 >= min) {
            ans.add(element1);
        }

        if(count2 >= min) {
            ans.add(element2);
        }

        return ans;
    }
}
