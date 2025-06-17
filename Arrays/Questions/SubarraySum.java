public class SubarraySum {
    public static void main(String[] args) {
        
    }

    public int subarraySum(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int curr = 0;
        int max = 0;

        while(r < n){
            
            curr += nums[r];

            while(curr > k && l <= r){
                curr -= nums[l];
                l++; 
            }

            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
