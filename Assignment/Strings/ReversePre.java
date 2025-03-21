public class ReversePre {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcd", 'z'));
    }

    static String reversePrefix(String word, char ch) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                result = word.substring(0, i + 1);
                return new StringBuilder(result).reverse().toString() + word.substring(i + 1, word.length());
            } else {
                result += word.charAt(i);
            }
        }
        return result;
    }
}
