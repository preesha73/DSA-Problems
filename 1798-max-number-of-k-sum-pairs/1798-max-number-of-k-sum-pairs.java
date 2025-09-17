
class Solution {
    public int maxOperations(int[] nums, int k) {
        int maxOperations = 0;
        int left = 0, right = nums.length - 1;

        Arrays.sort(nums); // Sorting takes O(n log n)

        while (right > left) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                maxOperations++;
                left++;  // Move left pointer
                right--; // Move right pointer
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return maxOperations;
    }
}