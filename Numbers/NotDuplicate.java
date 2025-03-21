public class NotDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        System.out.println(notDuplicate(arr));
    }

    static int notDuplicate(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
    }
}