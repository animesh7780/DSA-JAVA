package Methods;

public class Overloading {
    public static void main(String[] args) {

        sum(23, 50);
        name("Abhishek");

    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void name(String name) {
        System.out.println(name);
    }
}
