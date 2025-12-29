import java.util.Arrays;

public class AppleRedistribution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int need = 0;

        for(int x : apple){
            need += x;
        }

        int sum = 0;
        int cnt = 0;
        Arrays.sort(capacity);
        
        for(int i=capacity.length - 1; i>=0 && sum < need; i++){
            sum += capacity[i];
            cnt++;
        }
        return cnt;
    }

}
