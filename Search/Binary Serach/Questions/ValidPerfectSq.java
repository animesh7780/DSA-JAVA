public class ValidPerfectSq {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true; // 0 and 1 are perfect squares
        }
        
        int low = 1, high = num / 2;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            
            if (square == num) {
                return true;
            } else if (square > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return false;
    }
}
