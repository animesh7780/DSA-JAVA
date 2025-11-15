import java.util.Arrays;
import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] suffixSum = new int[n];
        Arrays.fill(suffixSum, 0);

        if (n > 0) {
            suffixSum[n-1] = arr[n-1];
            for(int i = n-2; i >= 0; i--){
                suffixSum[i] = arr[i] + suffixSum[i+1];
            }
            System.out.println(Arrays.toString(suffixSum));
        } else {
            System.out.println("Array size must be positive");
        }
        sc.close();
    }

}
