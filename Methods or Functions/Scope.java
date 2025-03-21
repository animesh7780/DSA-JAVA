package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 90;
        int b = 100;

        for (int i = 0; i < 10; i++) {
            a = 10000;
        }
        System.out.println(a);
    }

}
