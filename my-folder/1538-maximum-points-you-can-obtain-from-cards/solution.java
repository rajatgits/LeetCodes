class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
            maxSum = leftSum;
        }

        int rIndex = cardPoints.length - 1;
        for(int j = k - 1; j >= 0; j--) {
            leftSum -= cardPoints[j];
            rightSum += cardPoints[rIndex];
            rIndex--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}
