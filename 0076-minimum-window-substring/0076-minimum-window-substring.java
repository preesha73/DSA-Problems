class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int[] need = new int[128];
        for(char c : t.toCharArray()) need[c]++;
        int req = 0;
        for(int i = 0; i < 128; i++) if (need[i] > 0) req++;

        int[] window = new int[128];
        int left = 0, right = 0, formed = 0;
        int ansLen = Integer.MAX_VALUE, ansLeft = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            window[c]++;

            if(window[c] == need[c]) formed++;
            while(left <= right && formed == req){
                if(right - left + 1 < ansLen){
                    ansLen = right - left + 1;
                    ansLeft = left;
                }
                char d = s.charAt(left);
                window[d]--;
                if(window[d] < need[d]) formed--;
                left++;
            }
            right++;
        }
        return ansLen == Integer.MAX_VALUE ? "" : s.substring(ansLeft, ansLeft + ansLen);
    }
}