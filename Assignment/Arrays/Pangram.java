public class Pangram {
    public static void main(String[] args) {
        System.out.println(pangram("leetcode"));
    }

    static boolean pangram(String str) {
        for (char c : str.toCharArray()) {
            if (c == "") {
                return true;
            }
        }
        return false;
    }
}
