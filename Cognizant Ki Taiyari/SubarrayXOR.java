import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> xora = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            int xor = 0;
            for(int j=i+1; j<n; j++){
                xor ^= arr[j];
                xora.add(xor);
            }
        }
        System.out.println(xora.toString());
        sc.close();
    }
}
