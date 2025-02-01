public class Leet389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Leet389 obj = new Leet389();
        System.out.println(obj.findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) != s.charAt(j)) {
                    return t.charAt(i);
                }
            }
        }
        return ' ';
    }
}
