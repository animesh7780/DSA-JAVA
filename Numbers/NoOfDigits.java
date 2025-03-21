public class NoOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int b = 10;

        int ans = (int) (Math.log(num) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
