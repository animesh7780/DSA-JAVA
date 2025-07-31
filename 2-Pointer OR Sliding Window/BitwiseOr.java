import java.util.ArrayList;
import java.util.HashSet;

public class BitwiseOr {
    public int subarrayBitwiseORs(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int left = 0; left < n; left++) {
            int or = 0;
            for (int right = left; right < n; right++) {
                or |= arr[right];
                set.add(or);

                if(or == -1) break;
            }
        }
        return set.size();
    }
}
