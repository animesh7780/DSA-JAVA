import java.util.HashSet;

public class Leet217 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        Leet217 obj = new Leet217();
        System.out.println(obj.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
