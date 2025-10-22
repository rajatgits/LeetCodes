class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for(int pile : piles) {
            right = Math.max(right, pile);
        }

        while(left < right) {
            int mid = left + (right - left)/2;
            if(complete(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean complete(int[] piles, int mid, int h) {
        int total = 0;
        for(int i = 0; i < piles.length; i++) {
            total += Math.ceil((double)piles[i]/mid);
        }
        return total <= h;
    }
} 
