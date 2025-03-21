public class Leet374 {
    public static void main(String[] args) {

    }

    public int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = guess(mid); // Call guess function here

            if (ans == 0) {
                return mid; // Correct guess
            } else if (ans < 0) {
                end = mid - 1; // The number is lower
            } else {
                start = mid + 1; // The number is higher
            }
        }

        return -1;
    }

}
