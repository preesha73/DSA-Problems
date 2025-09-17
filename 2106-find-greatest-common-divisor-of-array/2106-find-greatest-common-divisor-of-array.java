class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int gcd = 1;
        int j = 2;
        while(min != 0 && j <= min){
            if(max % j == 0 && min % j == 0){
                gcd = gcd * j;
                max = max / j;
                min = min / j;
            } else {
                j++;
            }
        }
        return gcd;
    }
}