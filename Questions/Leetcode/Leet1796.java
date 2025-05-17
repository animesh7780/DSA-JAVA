public class Leet1796 {
    public static void main(String[] args) {

    }

    public int secondHighest(String s) {
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num > secondMax && num < max) {
                    secondMax = num;
                }
            }
        }
        return secondMax;
    }
}
