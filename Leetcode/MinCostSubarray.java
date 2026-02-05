public class MinCostSubarray {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int n = nums.length;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }else if(nums[i] > secondSmallest){
                secondSmallest = nums[i];
            }
        }
        return first + smallest + secondSmallest;
    }
}
