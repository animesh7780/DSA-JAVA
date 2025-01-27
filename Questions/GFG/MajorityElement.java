public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 3, 2 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int arr[]) {
        int count = 0;
        int candidate = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (candidate == arr[i]) {
                count++;
            } else if (count < 0) {
                return -1;
            } else {
                count--;
            }

        }
        return candidate;
    }
}
