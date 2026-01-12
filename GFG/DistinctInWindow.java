import java.util.ArrayList;
import java.util.HashMap;

public class DistinctInWindow {
    // ArrayList<Integer> countDistinct(int arr[], int k) {
    //     // code here
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     ArrayList<Integer> res = new ArrayList<>();
    //     int n = arr.length;

    //     for(int i=0; i<k; i++){
    //         map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    //     }
    //     res.add(map.size());

    //     for(int i=k; i<n; i++){
    //         map.put(arr[i-k], map.get(arr[i - k]) - 1); 
    //         if(map.get(arr[i-k]) == 0){
    //             map.remove(arr[i-k]);
    //         }
    //         map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    //         res.add(map.size());
    //     }
    //     return res;
    // }

    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int[] freq = new int[100001];

        //first window
        for(int i=0; i<k; i++){
            freq[arr[i]]++;
        }
        int dis = 0;
        for(int f : freq){
            if(f > 0) dis++;
        }
        ans.add(dis);

        //sliding the window
        for(int i=k; i<n; i++){
            if(--freq[arr[i-1]] == 0){
                dis--;
            }
            if(freq[arr[i]]++ == 0){
                dis++;
            }
            ans.add(dis);
        }
        return ans;
    }
}
