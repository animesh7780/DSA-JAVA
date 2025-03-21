public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        if (s == "")
            return true;
        if (s == null)
            return false;
        s = s.toLowerCase();
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }
}
