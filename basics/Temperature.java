import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in celcius :");
        float tempInC = sc.nextFloat();

        float tempInF = (tempInC * 9 / 5) + 32;

        System.out.println(tempInF);
        sc.close();
    }
}
