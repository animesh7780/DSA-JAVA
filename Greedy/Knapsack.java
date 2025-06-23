import java.util.Arrays;

public class Knapsack {
    double fractionalKnapsack(int n, int w, int[] values, int[] weight){
        Arrays.sort(values);
        Arrays.sort(weight);
        int ans = 0;
        int leftOut=0;

        for(int j=0; j<values.length; j++){
            for(int i=0; i<weight.length; i++){
                if(weight[i] <= w){
                    ans = ans+values[j];
                    leftOut = w - weight[i];
                }else{
                    
                }
            }
        }
    }
}
