public class JumpGameII {
    public int jump(int[] nums) {
        int n = nums.length;

        int jumps = 0;
        int farthest = 0;
        int current = 0;
        
        for(int i=0; i<n; i++){
            farthest = Math.max(farthest, i+nums[i]);

            if(i == current){
                jumps++;
                current = farthest;

                if(current >= n-1){
                    break;
                }

            }
        }
        return jumps;
    }
}
