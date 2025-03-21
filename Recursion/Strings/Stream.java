public class Stream {
    public static void main(String[] args) {
        skip("", "abc");
        System.out.println(skip1("abcgqaaa"));
        System.out.println(skipApple("appleabcgqaaa"));
        System.out.println(skipAppnotApple("appleabcgqapp"));
    }

    static void skip(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        if (ch == 'a') {
            skip(p, u.substring(1));
        } else {
            skip(p + ch, u.substring(1));
        }
    }

    static String skip1(String u) {
        if (u.isEmpty()) {
            return "";
        }
        char ch = u.charAt(0);
        if (ch == 'a') {
            return skip1(u.substring(1));
        } else {
            return ch + skip1(u.substring(1));
        }
    }

    static String skipApple(String u) {
        if (u.isEmpty()) {
            return "";
        }

        if (u.startsWith("apple")) {
            return skipApple(u.substring(5));
        } else {
            return u.charAt(0) + skipApple(u.substring(1));
        }
    }

    // skip app but not apple
    static String skipAppnotApple(String u) {
        if (u.isEmpty()) {
            return "";
        }

        if (u.startsWith("app") && !u.startsWith("apple")) {
            return skipAppnotApple(u.substring(3));
        } else {
            return u.charAt(0) + skipAppnotApple(u.substring(1));
        }
    }
}