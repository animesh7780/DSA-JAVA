package Methods;

public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        int x = 40;
        System.out.println(x);
        play();
    }

    static void play() {
        System.out.println(x);// pulling value of x from class Shadowing
    }
}
