import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int ind = 0;

        while(ind < n && citations[n - 1 - ind] > ind){
            ind++;
        }
        return ind;
    }
}
