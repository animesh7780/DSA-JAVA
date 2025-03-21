//leetcode 78

import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
        List<List<Integer>> result2 = subsetsDuplicate(nums);
        System.out.println(result2);
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : nums) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetsDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int i = 1; i < nums.length; i++) {
            s = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                s = e + 1;
            }
            e = outer.size() - 1;
            int size = outer.size();
            for (int j = s; j < size; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
