import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> list = new ArrayList<>();
        list = permutation1("", "abc");
        System.out.println(list);
        System.out.println(Countpermutation("", "abc"));
    }

    static void permutation(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, u.substring(1));
        }
    }

    static int Countpermutation(String p, String u) {
        int count = 0;
        if (u.isEmpty()) {
            System.out.println(p);
            return 1;
        }
        char ch = u.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + Countpermutation(f + ch + s, u.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutation1(String p, String u) {
        if (u.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = u.charAt(0);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutation1(f + ch + s, u.substring(1)));
        }
        return list;
    }
}
