public class Leet371 {
    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        Leet371 obj = new Leet371();
        System.out.println(obj.getSum(a, b));
    }

    public int getSum(int a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++; // Increment 'a' for positive 'b'
            }
        } else {
            for (int i = 0; i < -b; i++) {
                a--; // Decrement 'a' for negative 'b'
            }
        }
        return a;
    }
}
