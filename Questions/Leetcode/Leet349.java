import java.util.*;

public class Leet349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            if (set.contains(nums2[i])) {
                if (list.contains(nums2[i])) {
                    continue;
                }
                list.add(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}