import java.util.List;
import java.util.ArrayList;

public class Leet18 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 2 };
        Leet18 obj = new Leet18();
        System.out.println(obj.fourSum(arr, 8));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 4) return res;
    }
}
