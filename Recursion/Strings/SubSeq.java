import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        sequence("", "aac");
        ArrayList<String> list = new ArrayList<>();
        sequence1("", "abc", list);
        System.out.println(list);
        System.out.println(sequence2("", "abc"));
        sequenceAscii("", "abc");
    }

    static void sequence(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        sequence(p + ch, u.substring(1));
        sequence(p, u.substring(1));

    }

    static ArrayList<String> sequence1(String p, String u, ArrayList<String> list) {
        if (u.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = u.charAt(0);
        sequence1(p + ch, u.substring(1), list);
        sequence1(p, u.substring(1), list);
        return list;
    }

    static ArrayList<String> sequence2(String p, String u) {
        if (u.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = u.charAt(0);
        ArrayList<String> left = sequence2(p + ch, u.substring(1));
        ArrayList<String> right = sequence2(p, u.substring(1));
        left.addAll(right);
        return left;
    }

    static void sequenceAscii(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        sequenceAscii(p + ch, u.substring(1));
        sequenceAscii(p, u.substring(1));
        sequenceAscii(p + (ch + 0), u.substring(1));

    }
}
