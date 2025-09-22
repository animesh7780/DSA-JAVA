import java.util.HashMap;
import java.util.Map;

public class EleWithMaxFreq {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> tb = new HashMap<>();
        
        for(int x : nums){
            tb.put(x, tb.getOrDefault(x, 0)+1);
        }

        int max = 0;
        for(int mx : tb.values()){
            if(mx > max) max = mx;
        }

        int ans = 0;
        for(int gg : tb.values()){
            if(gg == max) ans += gg;
        }
        return ans;
    }
}
