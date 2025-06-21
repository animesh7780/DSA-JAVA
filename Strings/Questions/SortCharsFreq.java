import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharsFreq{

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        //build frequency map
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0 ) + 1);
        }

        //sorting them using frequency
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));

        //printing the resultant string
        String result = "";
        for(char c : chars){
            int freq = map.get(c);
            for(int i=0; i<freq; i++){
                result += c;
            }
        }
        return result;
    }

}