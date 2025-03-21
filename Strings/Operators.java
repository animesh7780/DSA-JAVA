import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');// ascii value
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));// when we add char and int it will convert int to char

        System.out.println("a" + 3);// when we add string and int it will convert int to string

        System.out.println("Animesh" + new ArrayList<>());

        // System.out.println(new Integer(3)+ new ArrayList<>()); //cannot add int to
        // arraylist instring because it will convert int to string
    }
}
