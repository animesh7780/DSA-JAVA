import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat();

        // type casting

        // int num = (int) (67.99f);
        // System.out.println(num);

        // automatic promotion in expressions

        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b);

        // byte a = 50;
        // byte b = 37;
        // byte c = 12;

        // int d = a * b / c;
        // System.out.println(d);

        // int number = 'a';
        // System.out.println(number);

        byte b = 21;
        int i = 3232;
        float f = 65.786f;
        double d = 76398.7826;
        long l = 76713891237l;

        System.out.println((b * i) + "  " + (f * d) + "  " + l);
        System.out.println((b * i) - (f * d) + l);

        sc.close();
    }
}
