import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDigits {
    static Map<Integer, String> digitToLetters = new HashMap<>();

    static {
        digitToLetters.put(2, "abc");
        digitToLetters.put(3, "def");
        digitToLetters.put(4, "ghi");
        digitToLetters.put(5, "jkl");
        digitToLetters.put(6, "mno");
        digitToLetters.put(7, "pqrs");
        digitToLetters.put(8, "tuv");
        digitToLetters.put(9, "wxyz");
    }

    // Recursive function to build words
    public static void findWords(int[] arr, int index, StringBuilder current, List<String> result) {
        if (index == arr.length) {
            result.add(current.toString());
            return;
        }
        String letters = digitToLetters.get(arr[index]);
        for (char c : letters.toCharArray()) {
            current.append(c);
            findWords(arr, index + 1, current, result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }

    public static ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        findWords(arr, 0, new StringBuilder(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        List<String> words = possibleWords(arr);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
