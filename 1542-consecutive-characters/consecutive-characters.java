class Solution {
    public int maxPower(String s) {
        int maxLen = 0;
        int n = s.length();

        for (int i = 0; i < n;) {
            char cur = s.charAt(i); 
            int j = i, len = 0;

            while (j < n && s.charAt(j) == cur) {
                len++;
                j++;
            }

            i = j; 
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}