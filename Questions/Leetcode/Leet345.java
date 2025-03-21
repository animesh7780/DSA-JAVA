public class Leet345 {
    public static void main(String[] args) {
        String s = "IcecreAm";
        reverseVowels(s);
        System.out.println(s);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                // Swap vowels
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (isVowel(chars[i])) {
                j--;
            } else {
                i++;
            }
        }

        return new String(chars);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}
