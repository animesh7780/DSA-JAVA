public class ArrayToZero {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int x : nums){
            totalSum += x;
        }

        int validSections = 0;
        int leftSum = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                int rightSum = totalSum - leftSum;
                if(rightSum == leftSum){
                    validSections += 2;
                }
                else if(Math.abs(leftSum - rightSum) == 1){
                    validSections += 1;
                }
            }
            leftSum += nums[i];
        }
        return validSections;
    }
}
