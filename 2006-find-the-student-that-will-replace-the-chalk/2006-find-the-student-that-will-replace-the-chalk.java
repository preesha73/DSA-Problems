class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }

        // Reduce k modulo the total chalk to get the remaining chalk after full rounds
        k %= totalChalk;

        // Iterate over the students to find which one will replace the chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
        Solution cr = new Solution();
        int[] chalk = new int[] {5, 1, 5}; // Correct way to declare and initialize an array
        int k = 22;
        System.out.println(cr.chalkReplacer(chalk, k)); // Output: 0
    }
}