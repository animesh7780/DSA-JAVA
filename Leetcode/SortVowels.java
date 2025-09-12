import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowels {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] result = s.toCharArray();

        for(char c : result){
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        int idx = 0;

        for(int i=0; i<result.length; i++){
            if(isVowel(result[i])){
                result[i] = vowels.get(idx++);
            }
        }
        return new String(result);
    }

    // Helper method to check for vowels
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
