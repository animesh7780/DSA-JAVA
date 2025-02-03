public class Leet43 {

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        Leet43 obj = new Leet43();
        System.out.println(obj.multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        int num1i = Integer.parseInt(num1);
        int num2i = Integer.parseInt(num2);
        return String.valueOf(num1i * num2i);
    }
}
