import java.util.Scanner;

public class CharSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String q = sc.nextLine();
        int i=0, j=0;
        String res = "";

        while(i < s.length() && j < q.length()){
            res += s.charAt(i++);
            res += q.charAt(j++);
        }

        while(i < s.length()){
            res += s.charAt(i++);
        }

        while(i < q.length()){
            res += s.charAt(i++);
        }

        System.out.println(res);
        sc.close();
    }
}
