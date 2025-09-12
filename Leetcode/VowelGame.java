public class VowelGame {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) return true; // any vowel ⇒ Alice wins
        }
        return false; // no vowels ⇒ Bob wins
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
