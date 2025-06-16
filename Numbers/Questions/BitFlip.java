public class BitFlip {
    public static void main(String[] args) {
        
    }

    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int ans = countSetBitsSimple(xor);
        return ans;

    }
    public static int countSetBitsSimple(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;  // Check if LSB is 1
            n >>>= 1;        // Right shift (unsigned)
        }
        return count;
    }
}
