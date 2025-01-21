class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max = 0;
        for(int price : prices) {
            max = Math.max(max, price - buy);
            if(price < buy) {
                buy = price;
            }
        }
        return max;
    }
}
