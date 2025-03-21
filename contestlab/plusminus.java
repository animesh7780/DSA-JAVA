import java.util.Scanner;

public class plusminus {

    public static void calculateplusminus(int[] arr) {
        double totalElements = arr.length;

        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < totalElements; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.3f\n", (double) positiveCount / totalElements);
        System.out.printf("%.3f\n", (double) negativeCount / totalElements);
        System.out.printf("%.3f\n", (double) zeroCount / totalElements);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        calculateplusminus(arr);

        sc.close();
    }
}
