import java.util.HashSet;
import java.util.Scanner;

public class lab3 {
    public static void zeroSumSubarray(int[] arr) {

        int cumulativeSum = 0;
        HashSet<Integer> sumSet = new HashSet<>();

        for (int num : arr) {
            cumulativeSum += num;

            if (cumulativeSum == 0 || sumSet.contains(cumulativeSum)) {
                System.out.println("True");
                System.out.println(arr.length);
                return;
            }

            sumSet.add(cumulativeSum);
        }

        System.out.println("False");
        System.out.println(arr.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        zeroSumSubarray(arr);
        sc.close();
    }
}
