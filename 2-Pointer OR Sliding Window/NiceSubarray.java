public class NiceSubarray {
    int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        if (k < 0) return 0;
        
        int left = 0;
        int count = 0;
        int result = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                count++;
            }
            
            while (count > k) {
                if (nums[left] % 2 == 1) {
                    count--;
                }
                //contracting the window
                left++;
            }
            
            result += right - left + 1;
        }
        
        return result;
    }
}
