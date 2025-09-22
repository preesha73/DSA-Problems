class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        
        for(int p : cardPoints) total += p;

        int windowSize = n - k;
        int currSum = 0;

        for(int i = 0; i < windowSize; i++) {
            currSum += cardPoints[i];
        }

        int minSum = currSum;
        for(int i = windowSize; i < n; i++){
            currSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, currSum);
        }
        return total - minSum;
    }
}