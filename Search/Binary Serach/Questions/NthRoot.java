public class NthRoot {
    public static void main(String[] args) {

        int n = 64;
        int p = 2;

        System.out.println(findNthRoot(n, p));
        
    }
    
    public static int findNthRoot(int number, int root) {
        if (number == 1) return 1;
        if (root == 1) return number;
        
        int low = 1;
        int high = number;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Prevent overflow
            long midPower = getPower(mid, root);
            
            if (midPower == number) {
                return mid;
            } else if (midPower > number) {
                high = mid - 1;  // Search in lower half
            } else {
                low = mid + 1;   // Search in upper half
            }
        }
        return -1; // No perfect nth root exists
    }

    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
            // Prevent overflow by checking if result is getting too large
            if (result > Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        }
        return result;
    }
}
