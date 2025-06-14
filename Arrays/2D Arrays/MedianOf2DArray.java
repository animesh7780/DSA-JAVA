import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOf2DArray{
    double findMedian(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : arr) {
            for (int val : row) list.add(val);
        }
        Collections.sort(list);
        int n = list.size();
        if ((n & 1) == 1) {                    // for odd we do /2
            return list.get(n / 2);
        } else {                               // for even we do /2 -1
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
    }
}