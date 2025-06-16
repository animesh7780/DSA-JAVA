public class MaxDiffEle {
    public static void main(String[] args) {
        
    }
    // public int maximumDifference(int[] nums) {
    //     int n = nums.length;
    //     int maxDiff = -1;
        
    //     for(int i = 0; i < n; i++){
    //         for(int j = i + 1; j < n; j++){
    //             if(nums[j] > nums[i]){
    //                 maxDiff = Math.max(maxDiff, nums[j] - nums[i]);
    //             }
    //         }
    //     }
    //     return maxDiff;
    // }

    //optimized approach

    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] > min){
                maxDiff = Math.max(maxDiff, nums[i]-min);
            }
            min = Math.max(min, nums[i]);
        }
        return maxDiff;
    }
}
