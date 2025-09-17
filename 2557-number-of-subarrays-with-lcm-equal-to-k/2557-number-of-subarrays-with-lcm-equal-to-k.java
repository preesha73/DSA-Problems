class Solution {
    public int subarrayLCM(int[] nums, int k) {
        for(int i = 0; i < nums.length ; i++){
            if(k % nums[i] != 0){
                nums[i] = -1;
            }
        }
        int i = 0;
        int j = 0;
        int lc = 1;
        int ans = 0;
        while(j < nums.length){
            if(nums[j] == -1){
                i = i+1;
                j = i;
                lc = 1;
                continue;
            }
            lc = lcm(nums[j],lc);
            if(lc < k){
                j++;
            }else if(lc == k){
                ans++;
                j++;
                if(j == nums.length){
                    i = i+1;
                    j = i;
                    lc = 1;
                }
            }else{
                i = i+1;
                j = i;
                lc = 1;
            }
        }
        return ans;
    }
    
    
      static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}