import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Arrays;

public class VowelSpellchecker {
   public String[] spellchecker(String[] wordlist, String[] queries) {
        // 1) Exact-case set
        Set<String> exact = new HashSet<>(Arrays.asList(wordlist)); // O(W) [web:1][web:8]

        // 2) Lowercase -> first original occurrence
        Map<String, String> lowerFirst = new HashMap<>(); // O(W) [web:1][web:3]
        // 3) Vowel-masked(lower) -> first original occurrence
        Map<String, String> maskFirst = new HashMap<>();  // O(W) [web:1][web:4]

        for (String w : wordlist) {
            String lw = w.toLowerCase();
            lowerFirst.putIfAbsent(lw, w);                 // keep first occurrence [web:1][web:8]
            String mw = mask(lw);
            maskFirst.putIfAbsent(mw, w);                  // keep first occurrence [web:4][web:8]
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                ans[i] = q;                                // exact match [web:1][web:6]
                continue;
            }
            String lq = q.toLowerCase();
            if (lowerFirst.containsKey(lq)) {
                ans[i] = lowerFirst.get(lq);               // case-insensitive match [web:1][web:4]
                continue;
            }
            String mq = mask(lq);
            if (maskFirst.containsKey(mq)) {
                ans[i] = maskFirst.get(mq);                // vowel-error match [web:1][web:4]
            } else {
                ans[i] = "";                               // no match [web:1][web:8]
            }
        }
        return ans;
    }

    private String mask(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(isVowel(c) ? '*' : c);               // mask vowels uniformly [web:4][web:8]
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; // y not a vowel [web:4][web:6]
    }
}
