public class Len3PalindromicString {
        public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int ans = 0;

        // For each possible outer character 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {

            int left = -1;
            int right = -1;

            // Find first occurrence (left)
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ch) {
                    left = i;
                    break;
                }
            }

            // Find last occurrence (right)
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == ch) {
                    right = i;
                    break;
                }
            }

            // Need at least one char between left and right
            if (left != -1 && right != -1 && right - left > 1) {

                // Track unique middle characters between left and right
                boolean[] seen = new boolean[26];

                for (int k = left + 1; k < right; k++) {
                    char mid = s.charAt(k);
                    seen[mid - 'a'] = true;
                }

                // Count how many distinct middle characters
                int cnt = 0;
                for (int i = 0; i < 26; i++) {
                    if (seen[i]) cnt++;
                }

                ans += cnt;
            }
        }

        return ans;
    }
}
