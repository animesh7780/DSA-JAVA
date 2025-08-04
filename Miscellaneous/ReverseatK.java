import java.util.Scanner;

public class ReverseatK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int[] result = reversedArray(arr, k);

        System.out.println("Resulting array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int[] reversedArray(int[] arr, int k){
        int ind = 0;
        int n = arr.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            if(arr[i] == k){
                ind = i;
                break;
            }
        }
        for(int i=0; i<=ind; i++){
            ans[i] = arr[ind-i];
        }

        for(int i=ind+1; i<n; i++){
            ans[i] = arr[i];
        }

        return ans;
    }

}