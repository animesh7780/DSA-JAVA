public class MaxCon1s{
    // Brute Force Solution - O(n²)
    public int longestOnes1(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        
        for(int i = 0; i < n; i++){
            int countZ = 0;
            int len = 0;
            
            // Sliding the second pointer
            for(int j = i; j < n; j++){
                if(nums[j] == 0) {
                    countZ++;
                }
                
                // If we have more than k zeros, break
                if(countZ > k) {
                    break;
                }
                
                // Update length of current subarray
                len = j - i + 1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    //optimal
    public int longestOnes(int[] nums, int k){
        int left = 0, right = 0;
        int maxLen = 0;
        int CountZ = 0;
        
        while(right < nums.length) {
            // Expand window
            if(nums[right] == 0) {
                CountZ++;
            }

            //contracting the window
            while(CountZ > k){
                if(nums[left] == 0){
                    CountZ--;
                }
                left--;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}