import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int num[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majEle(num);
    }

    public static void majEle(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Print the elements that appear more than n/3 times
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }
}
