public class NumbersRecursion {
    public static void main(String[] args) {
        print(0);
    }

    static void print(int n) {
        // base condition
        if (n == 10) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
