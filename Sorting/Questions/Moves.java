import java.util.Arrays;

public class Moves {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int moves = 0;

        Arrays.sort(nums);

        int eleToGet = nums[n/2];
        for(int i=0; i<n; i++){
            if(nums[i] == eleToGet){
                continue;
            }
            moves += Math.abs(eleToGet - nums[i]);
        } 
        return moves;
    }
}
