public class Leet125 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        if (s == "")
            return true;
        if (s == null)
            return false;
        s = s.toLowerCase();
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleanedString.length() - 1;
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
