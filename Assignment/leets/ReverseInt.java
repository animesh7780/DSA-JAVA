//leetcode 7
public class ReverseInt {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}