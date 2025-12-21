import java.util.Arrays;

public class BusConductor {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int n = chairs.length;
        int steps = 0;
        
        for(int i=0;i<n; i++){
            int sub = Math.abs(chairs[i] - passengers[i]);
            steps += sub;
        }
        return steps;
    }
}
