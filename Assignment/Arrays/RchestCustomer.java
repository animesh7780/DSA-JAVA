public class RchestCustomer {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, },
                { 4, 5, 6, },
                { 7, 8, 9, }
        };
        System.out.println(richestCustomer(arr));
    }

    static int richestCustomer(int[][] arr) {
        int max = 0;
        for (int rows = 0; rows < arr.length; rows++) {
            int rowsum = 0;
            for (int cols = 0; cols < arr[rows].length; cols++) {
                rowsum += arr[rows][cols];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
