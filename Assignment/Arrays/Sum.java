public class Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));
    }

    static int sum(int ar[]) {
        int sum = 0;
        for (int nums : ar) {
            sum += nums;
        }
        return sum;
    }
}