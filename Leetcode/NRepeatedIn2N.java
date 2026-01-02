import java.util.HashMap;
import java.util.Map;

public class NRepeatedIn2N {
    // public int repeatedNTimes(int[] nums) {

    //     int n = nums.length;
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int i=0; i<n; i++){
    //         map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    //     }

    //     for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    //         if (e.getValue() >= n / 2) {
    //             return e.getKey();
    //         }
    //     }
    //     return -1;
    // }

    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int cnt = 0;

        for(int i=1; i<=n; i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }
            if(cnt >= 2){
                return nums[i];
            }
        }
        return -1;
    }
}
