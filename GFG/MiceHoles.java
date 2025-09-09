import java.util.Arrays;

public class MiceHoles {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int n = mices.length;
        int maxTime = 0;
        
        for(int i=0; i<n; i++){
            int time = Math.abs(mices[i] - holes[i]);
            if(time > maxTime) maxTime = time;
        }
        return maxTime;   
    }
}
