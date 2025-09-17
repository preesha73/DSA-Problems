class Solution {
    public int maxProduct(int[] nums) {
        int i = 1;
        int j = 1;
        int ans = nums[0];
        int n = nums.length;

        for(int m = 0; m < n; m++){
            i = (i == 0) ? 1 : i;
            j = (j == 0) ? 1 : j;

            i *= nums[m];
            j *= nums[n - 1 - m];

            ans = Math.max(ans, Math.max(i, j));
        }
        return ans;
            
    }
}