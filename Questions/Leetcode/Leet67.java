import java.math.BigInteger;

public class Leet67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Leet67 obj = new Leet67();
        System.out.println(obj.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);
        return sum.toString(2);

    }
}
