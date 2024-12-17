
//leetcode 17
import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        pad("", "23");
        ArrayList<String> list = new ArrayList<>();
        list = pad1("", "23");
        System.out.println(list);
    }

    static void pad(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = u.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, u.substring(1));
        }
    }

    static ArrayList<String> pad1(String p, String u) {
        if (u.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = u.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad1(p + ch, u.substring(1)));
        }
        return list;
    }
}
