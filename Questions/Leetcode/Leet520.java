public class Leet520 {
    public static void main(String[] args) {
        String word = "FlaG";
        Leet520 obj = new Leet520();
        System.out.println(obj.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word == word.toUpperCase()) {
                return true;
            }
            if (word == word.toLowerCase()) {
                return true;
            }
            if (Character.isUpperCase(word.charAt(0)) && word.substring(1) == word.substring(1).toLowerCase()) {
                return true;
            }
        }
        return false;
    }
}
