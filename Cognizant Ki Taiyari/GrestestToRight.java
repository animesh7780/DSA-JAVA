import java.util.Arrays;
import java.util.Scanner;

public class GrestestToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int i = n-1;
        int max = -1;
        while(i >= 0){
            if(arr[i] > max){
                int t = max;
                max = arr[i];
                arr[i--] = t;
                continue;
            }
            arr[i--] = max;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
