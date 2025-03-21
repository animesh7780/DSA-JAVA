import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        if (fruit.equals("apple")) {
            System.out.println("a sweet red fruit");
        }
        if (fruit.equals("mango")) {
            System.out.println("falo ka raja aam");
        }
        if (fruit.equals("banana")) {
            System.out.println("pottasium rich");
        }
        // new switch
        switch (fruit) {
            case "apple" -> System.out.println("red");
            case "mango" -> System.out.println("yellow");
            case "banana" -> System.out.println("yellow");
            case "grapes" -> System.out.println("green");
            default -> System.out.println("unknown");
        }

        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // switch (day) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("weekday");
        // break;
        // case 6:
        // case 7:
        // System.out.println("weekend");
        // break;
        // }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }

        sc.close();
    }
}
