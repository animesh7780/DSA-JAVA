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
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target && i != j && j != k && k != l) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            res.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }
}
