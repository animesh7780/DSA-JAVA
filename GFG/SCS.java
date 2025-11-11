public class SCS {
    public static int minSuperSeq(String s1, String s2) {
        // Base cases
        if (s1.isEmpty()) return s2.length();
        if (s2.isEmpty()) return s1.length();

        // If first characters match, move both pointers and add 1 to length
        if (s1.charAt(0) == s2.charAt(0)) {
            return 1 + minSuperSeq(s1.substring(1), s2.substring(1));
        } else {
            // Otherwise, consider two possibilities and take the minimum length
            int option1 = 1 + minSuperSeq(s1.substring(1), s2);
            int option2 = 1 + minSuperSeq(s1, s2.substring(1));
            return Math.min(option1, option2);
        }
    }
}
