class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;

        for(int i=0; i<piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        while(left <= right) {
            int mid = left+(right-left)/2;
            if(sumHour(piles, mid) > h) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }

    private int sumHour(int[]piles, int mid) {
        int sum = 0;
        for(int i=0; i<piles.length; i++) {
            sum += Math.ceil((double)piles[i]/(double)mid);
        }
        return sum;
    }
}
