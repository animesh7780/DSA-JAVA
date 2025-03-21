package Methods;

public class Prime {
    public static void main(String[] args) {
        prime(45); // Test with a sample number
    }

    static void prime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}
