class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwoLoop(int n){
        if(n <= 0) return false;
        while(n > 1) {
            if((n & 1) == 1) return false;
            n = n >>> 1;
        }
        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isPowerOfTwo(1));
        System.out.println(s.isPowerOfTwo(16));
        System.out.println(s.isPowerOfTwo(3));
        System.out.println(s.isPowerOfTwo(0));
        System.out.println(s.isPowerOfTwo(-2));
    }
}