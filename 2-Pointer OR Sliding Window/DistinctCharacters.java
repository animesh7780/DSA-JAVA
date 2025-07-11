import java.util.HashMap;
import java.util.HashSet;

public class DistinctCharacters {
    public int kDistinctChar(String s, int k) {
        int maxLen = 0;
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            HashSet<Character> distinctChars = new HashSet<>();
            
            for(int j = i; j < n; j++){
                distinctChars.add(s.charAt(j));
                
                if(distinctChars.size() <= k){
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break; // More than k distinct characters
                }
            }
        }
        return maxLen;
    }

    public int kDistinctChar1(String s, int k){
        int left = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0; right<s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0)+1);

            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
