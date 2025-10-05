class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start ^ goal;
        return Integer.bitCount(x);
    }

    public int minBitFlipsManual(int start, int goal){
        int x = start ^ goal;
        int count = 0;
        while(count != 0){
            count += (x & 1);
            x >>>= 1;
        }
        return count;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.minBitFlips(10, 7));
        System.out.println(s.minBitFlips(3, 4));
    }
}