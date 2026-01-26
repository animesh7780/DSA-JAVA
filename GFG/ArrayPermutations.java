import java.util.ArrayList;

public class ArrayPermutations {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        permutations(res, arr, 0);
        return res;
    }

    public static void permutations(ArrayList<ArrayList<Integer>> res, int[] arr, int idx){
        if(idx == arr.length){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int val : arr) temp.add(val);
            res.add(temp);
            return;
        }
        
        for(int i=idx; i<arr.length; i++){
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            permutations(res, arr, idx + 1);

            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = permuteDist(arr);

        for (ArrayList<Integer> x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}
