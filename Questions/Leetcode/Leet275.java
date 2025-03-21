public class Leet275 {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] == i + 1) {
                return citations[i];
            }
        }
        return 0;
    }
}
