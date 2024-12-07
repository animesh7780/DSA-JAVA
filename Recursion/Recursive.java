public class Recursive {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello");
        message1();
    }

    static void message1() {
        System.out.println("World");
        message2();
    }

    static void message2() {
        System.out.println("World");
        message3();
    }

    static void message3() {
        System.out.println("World");
        message4();
    }

    static void message4() {
        System.out.println("World");
    }
}