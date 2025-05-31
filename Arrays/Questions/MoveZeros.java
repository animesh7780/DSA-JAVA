import java.util.Arrays;

//brute
// public class MoveZeros {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12};
//         moveZero(arr);
//         for (int num : arr) {
//             System.out.print(num + " ");
//         } 
//     }
//     public static void moveZero(int[] arr){
//         ArrayList<Integer> list = new ArrayList<>();
//         int n = arr.length;
//         for(int i=0; i < n; i++){
//             if(arr[i] != 0){
//                 list.add(arr[i]);
//             }
//         }
//         for(int i=0; i < list.size(); i++){
//             arr[i] = list.get(i);
//         }
//         for(int i = list.size(); i < n; i++){
//             arr[i] = 0;
//         }
//     }
// }

//optimal
public class MoveZeros{
    public static void main(String[] args) {
        int arr[] = {0,1,0,13,12};
        int[] result = moveZeros(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] moveZeros(int[] arr){
        int j = -1;

        int n= arr.length;
        for(int i=0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return arr;

        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] =temp;
                j++;
            }
        }
        return arr;
    }
}

