import java.util.Arrays;
import java.util.HashMap;

public class RankOfArray {
    int[] findRank(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int temp = 1;

        int dummy[] = new int[n];
        int ans[] = new int[n];

        //creating a dummy array as to sort it
        for(int i=0; i<n; i++){
            dummy[i] = arr[i];
        }

        Arrays.sort(dummy);

        //then we put in the map and rank each and every element and the same elements will be given the same rank
        for(int i=0; i<n; i++){
            //this null helps us to add the rank just once
            if(map.get(dummy[i]) == null){
                map.put(dummy[i], temp);
                temp++;
            }
        }

        //adding the rank in the ans array
        for(int i=0; i<n; i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
