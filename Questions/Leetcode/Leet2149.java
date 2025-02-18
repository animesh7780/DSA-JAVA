import java.util.List;
import java.util.ArrayList;

public class Leet2149 {
    public static void main(String[] args) {

    }

    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        for (int i = 0; i < pos.size(); i++) {
            for (int j = 0; j < neg.size(); j++) {
                if (i == j) {
                    result[i] = pos.get(i);
                    result[j] = neg.get(j);
                }
            }
        }
        return result;
    }
}
