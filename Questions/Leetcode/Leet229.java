import java.util.List;
import java.util.ArrayList;

public class Leet229 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        Leet229 obj = new Leet229();
        System.out.println(obj.majorityElement(nums));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0; // Reset count for each new element
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3 && !ans.contains(nums[i])) {
                ans.add(nums[i]); // Majority element found
            }
        }
        return ans;
    }
}
