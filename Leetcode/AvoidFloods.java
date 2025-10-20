import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class AvoidFloods {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        HashMap<Integer, Integer> lakeLastFilled = new HashMap<>();
        TreeSet<Integer> sunnyDays = new TreeSet<>();
        int[] res = new int[n]; 
        Arrays.fill(res, 1);

        for(int i=0; i<n; i++){
            if(rains[i] == 0){
                sunnyDays.add(i);
            }
            else{
                int lake = rains[i];
                res[i] = -1;

                if(lakeLastFilled.containsKey(lake)){
                    int lastRainDay = lakeLastFilled.get(lake);
                    Integer dryDay = sunnyDays.higher(lastRainDay);
                    if(dryDay == null){
                        return new int[0];
                    }
                    res[dryDay] = lake;
                    sunnyDays.remove(dryDay);
                }
                lakeLastFilled.put(lake, i);
            }
        }
        return res;
    }
}
