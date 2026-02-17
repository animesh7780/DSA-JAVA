import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        
        for(int hour = 0; hour < 12; hour++){
            for(int min=0; min<60; min++){
                int sum = Integer.bitCount(hour) + Integer.bitCount(min);

                if(sum == turnedOn){
                    String time = hour + ":" + (min < 10 ? "0" : "") + min;

                    ans.add(time);
                }
            }
        }
        return ans;
    }
}
