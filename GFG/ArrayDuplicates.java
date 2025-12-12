import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
