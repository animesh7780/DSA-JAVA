//leetcode 1346
public class Double {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
