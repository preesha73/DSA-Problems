class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k){
        if(k < 0) return 0;
        int n = nums.length;
        int[] freq = new int[n + 1];
        int left = 0, distinct = 0;
        long res = 0;

        for(int right = 0; right < n; right++){
            int x = nums[right];
            if(freq[x] == 0) distinct++;
            freq[x]++;

            while(distinct > k){
                int y = nums[left++];
                freq[y]--;
                
                if(freq[y] == 0) distinct--;
            }
            res += (right - left + 1);
        }
        return (int) res;
    }
}