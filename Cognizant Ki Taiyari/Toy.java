import java.util.ArrayList;
import java.util.Scanner;

public class Toy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for(int i=0; i<2*n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n; i++){
            list.add(arr[i]);
            list.add(arr[i+n]);
        }
        System.out.println(list.toString());
        sc.close();
    }
}
