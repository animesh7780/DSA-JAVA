import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double bill = sc.nextDouble();
        double discount = 0.0;
        if (bill > 1000) {
            discount = bill * 0.1;
        } else if (bill > 2000) {
            discount = bill * 0.2;
        }
        double total = bill - discount;
        System.out.println("Total amount: " + total);
        sc.close();
    }
}
