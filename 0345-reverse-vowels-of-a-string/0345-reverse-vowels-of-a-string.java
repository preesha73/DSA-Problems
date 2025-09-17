class Solution {
    public String reverseVowels(String s) {
	    String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int len = s.length();
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			while (start < end && !vowels.contains(Character.toString(chars[start]))) {
				start++;
			}
			while (start < end && !vowels.contains(Character.toString(chars[end]))) {
				end--;
			}
			char tmp = chars[end];
			chars[end] = chars[start];
			chars[start] = tmp;
			start++;
			end--;
		}
		return new String(chars);
    }
}