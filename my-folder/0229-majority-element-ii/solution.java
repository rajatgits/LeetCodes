class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(cnt1 == 0 && nums[i] != elem2) {
                cnt1 = 1;
                elem1 = nums[i];
            } else if(cnt2 == 0 && nums[i] != elem1) {
                cnt2 = 1;
                elem2 = nums[i];
            } else if(nums[i] == elem1) {
                cnt1++;
            } else if(nums[i] == elem2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == elem1) {
                count1++;
            }
            if(nums[i] == elem2) {
                count2++;
            }
        }

        int min = (int)(nums.length / 3) + 1;
        if(count1 >= min) {
            ans.add(elem1);
        }
        if(count2 >= min) {
            ans.add(elem2);
        }
        return ans;
    }
}
