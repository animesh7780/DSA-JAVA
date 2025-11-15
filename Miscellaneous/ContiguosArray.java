//we will replace all the zeros wuth -1 and then solve to calculate zero sum

import java.util.HashMap;

public class ContiguosArray {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i] == 0) nums[i] = -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLen = 0;
        int prefixSum = 0;

        for(int i=0; i<n; i++){
            prefixSum += nums[i];

            if(map.containsKey(prefixSum)){
                int prevInd = map.get(prefixSum);
                maxLen = Math.max(maxLen, i - prevInd);
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}
