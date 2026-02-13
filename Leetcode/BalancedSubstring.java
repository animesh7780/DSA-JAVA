import java.util.Arrays;

public class BalancedSubstring {
    public int longestBalanced(String s) {
        int n = s.length();
        int[] freq = new int[26];
        int ans = 0;

        for(int i=0; i<n; i++){
            Arrays.fill(freq, 0);
            int mx = 0, v = 0;
            for(int j=i; j<n; j++){
                int c = s.charAt(j) - 'a';

                if(++freq[c] == 1){
                    ++v;
                }
                mx = Math.max(mx, freq[c]);
                if(j - i + 1 == mx*v){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    public int longestBalanced(String s) {
        int n = s.length();
        int[] cnt = new int[26];
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            Arrays.fill(cnt, 0);
            int mx = 0, v = 0;
            for (int j = i; j < n; ++j) {
                int c = s.charAt(j) - 'a';
                if (++cnt[c] == 1) {
                    ++v;
                }
                mx = Math.max(mx, cnt[c]);
                if (mx * v == j - i + 1) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}

