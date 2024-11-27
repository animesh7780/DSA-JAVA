import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // System.out.println(arr[5]);//out of bound

        // input using for loop
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        for (int num : arr) {
            System.out.println(num);
        }
        // array of objects

        String arr1[] = new String[5];

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.next();
        }

        for (String s : arr1) {
            System.out.println(s);
        }
        arr1[1] = "Animesh";
        sc.close();
    }
}
