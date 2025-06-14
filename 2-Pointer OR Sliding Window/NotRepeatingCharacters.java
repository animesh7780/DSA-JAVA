import java.util.HashSet;

public class NotRepeatingCharacters{
    int lengthWithoutRepeat(String s) {
        int l = 0, r = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            } else {
                set.remove(s.charAt(l));    
                l++;
            }
        }

        return maxLength;
    }
}