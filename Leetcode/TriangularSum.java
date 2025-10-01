import java.util.ArrayList;

public class TriangularSum {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        for(int currL=n-1; currL>=0; currL--){
            for(int i=0; i<currL; i++){
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++){
            al.add(arr[i] + arr[i+1]);
        }

        System.out.println(al);
    }
}
