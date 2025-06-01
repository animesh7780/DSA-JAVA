public class Sqrt{
    public static void main(String[] args) {
        int n = 66;
        System.out.println(findSqrt(n));
    }
    public static long findSqrt(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    
    long start = 1;
    long end = n;
    long result = 0;
    
    while (start <= end) {
        long mid = start + (end - start) / 2;  // Avoid overflow
        long val = mid * mid;
        
        if (val == n) {
            return mid;  // Perfect square
        } else if (val < n) {
            start = mid + 1;
            result = mid;  // Store potential answer
        } else {
            end = mid - 1;
        }
    }
    
    return result;
}
}