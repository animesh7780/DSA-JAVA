import java.util.Scanner;

public class LinearSearch{
    public static boolean findNum(int[] arr, int target){
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(findNum(arr, target));
        sc.close();
    }
}