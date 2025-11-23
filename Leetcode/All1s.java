public class All1s {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int lastInd = -1;
        
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                if(lastInd == -1 && (i - lastInd) - 1 < k){
                    return false;
                }
                lastInd = i;
            }
        }
        return true;
    }
}
