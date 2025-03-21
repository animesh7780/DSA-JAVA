public class OddEven {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isOdd(num));
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}