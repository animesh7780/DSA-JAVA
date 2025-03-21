import java.util.Scanner;

public class pingenerator {

    public static int getSingleDigitSum(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static char getAlphabetForOddDigit(int digit) {
        return (char) ('a' + (digit - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter space-separated numbers:");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        StringBuilder pin = new StringBuilder();

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            int singleDigit = getSingleDigitSum(num);

            if (singleDigit % 2 == 1) {
                pin.append(getAlphabetForOddDigit(singleDigit));
            } else {
                pin.append(singleDigit);
            }
        }

        System.out.println("Generated PIN: " + pin);
        scanner.close();
    }

}
