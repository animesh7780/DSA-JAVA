public class Leet66 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        String a = "";
        for (int i = 0; i < digits.length; i++) {
            a += digits[i];
        }
        int b = Integer.parseInt(a) + 1;
        String c = String.valueOf(b);
        int[] d = new int[c.length()];
        for (int i = 0; i < c.length(); i++) {
            d[i] = Character.getNumericValue(c.charAt(i));
        }
        return d;
    }
}
