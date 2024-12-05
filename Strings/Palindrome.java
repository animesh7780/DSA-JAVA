public class Palindrome {
    public static void main(String[] args) {
        String str = "racear";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
