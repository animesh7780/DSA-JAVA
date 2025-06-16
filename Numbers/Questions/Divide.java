public class Divide{
    public static void main(String[] args) {
        
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        
        // Handle edge cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }
        
        // Handle signs
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Convert to long to avoid overflow during calculations
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        
        long quotient = 0;
        
        // Find the largest power of 2 * divisor that fits in dividend
        while (dividendL >= divisorL) {
            long tempDivisor = divisorL;
            long multiple = 1;
            
            // Double the divisor until it's larger than remaining dividend
            while (dividendL >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            dividendL -= tempDivisor;
            quotient += multiple;
        }
        
        return negative ? (int) -quotient : (int) quotient;
    }
}