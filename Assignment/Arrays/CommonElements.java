public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        int[] result = commonElements(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] commonElements(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return new int[] { arr1[i] };
                }
            }
        }
        return new int[] {};
    }
}
