public class Linear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println(result);
        System.out.println(linearSearch1(arr, target));
        System.out.println(linearSearch2(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int nums : arr) {
            if (nums == target) {
                return nums;
            }
        }
        return -1;
    }

    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int nums : arr) {
            if (nums == target) {
                return true;
            }
        }
        return false;
    }
}