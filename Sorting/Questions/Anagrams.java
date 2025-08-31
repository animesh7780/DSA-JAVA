import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String str : strs) {
            // Convert string to char array and sort
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            // Use sorted string as the key
            String sortedKey = String.valueOf(charArray);
            
            // Add original string to corresponding anagram group
            anagramGroups.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        
        // Return the grouped anagrams
        return new ArrayList<>(anagramGroups.values());
    }
}
