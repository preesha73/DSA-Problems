class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> freq = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            freq.add(num);
            }
            for(int i=1;i<=n;i++){
                if(!freq.contains(i)){
                    result.add(i);
            }  
        }
        return result;
    }
}