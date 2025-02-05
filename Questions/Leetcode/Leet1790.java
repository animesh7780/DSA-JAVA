public class Leet1790 {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        Leet1790 obj = new Leet1790();
        System.out.println(obj.areAlmostEqual(s1, s2));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        int first = -1, second = -1, count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2)
                    return false;

                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }
        return (count == 2 &&
                s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first));
    }
}
