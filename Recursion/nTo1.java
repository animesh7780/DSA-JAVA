public class nTo1 {
    public static void main(String[] args) {
        print(10);
        funprint(10);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    static void funprint(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
}
