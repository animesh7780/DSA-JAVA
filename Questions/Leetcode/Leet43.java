import java.math.BigInteger;

public class Leet43 {

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        Leet43 obj = new Leet43();
        System.out.println(obj.multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);

        BigInteger result = big1.multiply(big2);

        return result.toString();
    }
}
