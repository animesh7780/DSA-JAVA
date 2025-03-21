public class OnetoN {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        int num = 1;
        if (num == n) {
            return;
        }
        System.out.println(num);
        print(num + 1);
    }
}
