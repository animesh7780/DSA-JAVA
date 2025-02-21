public class Leet796 {
    public static void main(String[] args) {

    }

    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            // Swap characters
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            // Check if the modified string matches goal
            if (sb.toString().equals(goal)) {
                return true;
            }

            i++;
            j--;
        }

        return false;
    }
}
