public class PowerOf2 {
    public static void main(String[] args) {
        int n = 167;
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
