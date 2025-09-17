class Solution {
    public int longestConsecutive(int[] nums) {
        // Use a HashMap to store the frequency of numbers
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = 0;

        // Populate the HashMap with numbers
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate through the array to find the longest consecutive sequence
        for (int i = 0; i < n; i++) {
            // Check if nums[i] is the start of a sequence
            if (!map.containsKey(nums[i] - 1)) {
                int length = 1;
                int num = nums[i] + 1;

                // Find the length of the sequence
                while (map.containsKey(num)) {
                    length++;
                    num++;
                }

                // Update the maximum length of the sequence
                ans = Math.max(ans, length);
            }
        }

        return ans;
    }
}
