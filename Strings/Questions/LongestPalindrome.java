public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        int start = 0;
        int maxLen = 1;
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (center is at i)
            int len1 = expandAroundCenter(s, i, i);
            
            // Check for even-length palindromes (center is between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length palindrome centered at i
            int currentMax = Math.max(len1, len2);
            
            // Update the longest palindrome if we found a longer one
            if (currentMax > maxLen) {
                maxLen = currentMax;
                start = i - (currentMax - 1) / 2;
            }
        }
        
        return s.substring(start, start + maxLen);
    }
    
    /**
     * Helper method to expand around center and find palindrome length
     */
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
}
