public class CountingBits {
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] result = countingBits.countBits(5);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }
}
