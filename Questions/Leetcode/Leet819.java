import java.util.HashMap;

public class Leet819 {
    public static void main(String[] args) {

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("\\W+");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : banned) {
            map.remove(word);
        }
        String res = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                res = word;
            }
        }
        return res;
    }
}
