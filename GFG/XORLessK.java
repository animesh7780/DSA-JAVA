public class XORLessK {
    public int cntPairs(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int left = 0;
        int right = 1;

        while (left < n - 1) {
            if (right < n) {
                int xor = arr[left] ^ arr[right];
                if (xor < k) {
                    count++;
                }
                right++;
            } else {
                left++;
                right = left + 1;
            }
        }
        return count;
    }
}
