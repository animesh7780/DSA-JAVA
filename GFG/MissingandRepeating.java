import java.util.ArrayList;

public class MissingandRepeating {
    public ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(findDuplicates(arr));
        ans.add(findMissing(arr));
        return ans;
    }

    public int findMissing(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }

    public int findDuplicates(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
