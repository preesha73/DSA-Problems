class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();

        backtrack(r, new ArrayList<>(), nums, 0);
        return r;
    }

    private void backtrack(List<List<Integer>> resultList, List<Integer> currentSubset, int[] nums, int start){
        resultList.add(new ArrayList<>(currentSubset));

        for(int i = start; i < nums.length; i++){
            currentSubset.add(nums[i]);

            backtrack(resultList, currentSubset, nums, i + 1);

            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}