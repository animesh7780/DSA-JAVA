public class Leet392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        Leet392 obj = new Leet392();
        System.out.println(obj.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}
