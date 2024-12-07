public class ArrayStringAddition {
    public static void main(String[] args) {
        String[] s1 = { "1", "2", "3" };
        String[] s2 = { "1", "2", "5" };
        System.out.println(isAdditiveStrSame(s1, s2));
    }

    static boolean isAdditiveStrSame(String[] s1, String[] s2) {
        // iterate over the whole string to get the sum
        StringBuilder string1 = new StringBuilder();
        for (String w : s1) {
            string1.append(w);
        }

        StringBuilder string2 = new StringBuilder();
        for (String w : s2) {
            string2.append(w);
        }

        // checking the strings for equality
        if (string1.toString().equals(string2.toString())) {
            return true;
        }
        return false;
    }
}
