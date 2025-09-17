class Solution {
    public int findNumberOfLIS(int[] nums) {
        int x = nums.length;
        int[] dp = new int[x];
        int[] cnt = new int[x];
        Arrays.fill(dp, 1);
        Arrays.fill(cnt, 1);
        int maxi = 1;
        for (int i = 0; i < x; i++) {
            for (int prevInd = 0; prevInd < i; prevInd++) {
                if (nums[prevInd] < nums[i] && 1 + dp[prevInd] > dp[i]) {
                    dp[i] = 1 + dp[prevInd];
                    cnt[i] = cnt[prevInd];
                } else if (nums[prevInd] < nums[i] && 1 + dp[prevInd] == dp[i]) {
                    cnt[i] += cnt[prevInd];
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        int nos = 0;
        for (int i = 0; i < x; i++) {
            if (dp[i] == maxi)
                nos += cnt[i];
        }
        return nos;
    }
}