import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        ArrayList<Integer> leaders1 = leadersInArray(arr1);
        System.out.println("Leaders: " + leaders1);
        System.out.println();
    }
    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > max){
                list.add(arr[i]);
                max = arr[i]; 
            }
        }
        return list;
    }
}
