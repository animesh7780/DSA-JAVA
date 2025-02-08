import java.math.BigInteger;

public class Leet66 {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        StringBuilder a = new StringBuilder();

        for (int digit : digits) {
            a.append(digit);
        }

        BigInteger number = new BigInteger(a.toString());
        number = number.add(BigInteger.ONE);

        String resultStr = number.toString();
        int[] result = new int[resultStr.length()];

        for (int i = 0; i < resultStr.length(); i++) {
            result[i] = Character.getNumericValue(resultStr.charAt(i));
        }

        return result;
    }
}
