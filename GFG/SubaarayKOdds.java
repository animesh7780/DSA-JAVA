public class SubaarayKOdds {
    private long atMostK(int[] arr, int k) {
        if (k < 0) return 0;

        long count = 0;
        int left = 0;
        int oddCount = 0;

        for (int right = 0; right < arr.length; right++) {
            if ((arr[right] & 1) == 1) oddCount++;
    

            while (oddCount > k) {
                if ((arr[left] & 1) == 1) oddCount--;
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public long countSubarrays(int[] arr, int k) {
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }
}
