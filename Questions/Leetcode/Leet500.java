import java.util.*;

public class Leet500 {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        Leet500 obj = new Leet500();
        String[] res = obj.findWords(words);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public String[] findWords(String[] words) {
        String first = "qwertyuiopQWERTYUIOP", second = "asdfghjklASDFGHJKL", third = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (first.contains(word) || second.contains(word) || third.contains(word)) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
