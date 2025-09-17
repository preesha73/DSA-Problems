class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000); 

        int total = 0;
        int prevValue = 0;

        // Iterate through each character in the Roman numeral string
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it to the total
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Roman numeral IV is: " + romanToInt("IV"));   // Output: 4
        System.out.println("Roman numeral IX is: " + romanToInt("IX"));   // Output: 9
        System.out.println("Roman numeral LVIII is: " + romanToInt("LVIII")); // Output: 58
        System.out.println("Roman numeral MCMXCIV is: " + romanToInt("MCMXCIV")); // Output: 1994
    }
}