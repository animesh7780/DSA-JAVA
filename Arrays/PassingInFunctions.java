public class PassingInFunctions {
    public static void main(String[] args) {
        int nums[] = { 1, 43, 5, 567, 2 };
        changeArr(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    static void changeArr(int arr[]) {
        arr[0] = 1000;
    }
}
