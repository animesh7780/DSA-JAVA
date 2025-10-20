import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String prev = "";
        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!sorted.equals(prev)){
                res.add(word);
            }
            prev = sorted;
        }
        return res;
    }
}
