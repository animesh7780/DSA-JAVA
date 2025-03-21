public class Compariso {
    public static void main(String[] args) {
        String a = "Animesh";
        String b = "Animesh";
        System.out.println(a == b);
        // creating objects outside string pool
        String c = new String("Animesh");
        String d = new String("Animesh");
        System.out.println(c.equals(d));
        System.out.println(c.charAt(0));
    }
}
