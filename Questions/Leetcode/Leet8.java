public class Leet8 {
    public static void main(String[] args) {
        String s = "0-1";
        Leet8 obj = new Leet8();
        System.out.println(obj.myAtoi(s));
    }

    public int myAtoi(String s) {
        return Integer.parseInt(s);
    }
}
