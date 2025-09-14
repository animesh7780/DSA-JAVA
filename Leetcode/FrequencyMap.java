import java.util.HashMap;

public class FrequencyMap {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonants = new HashMap<>();

        for(char c : s.toCharArray()){
            if(isVowel(c)){
                vowels.put(c, vowels.getOrDefault(c, 0) + 1);
            }
            else{
                consonants.put(c, consonants.getOrDefault(c, 0)+1);
            }
        }

        int maxVowel = 0;
        for(int v : vowels.values()) maxVowel = Math.max(maxVowel, v);

        int maxCons = 0;
        for(int c : consonants.values()) maxCons = Math.max(maxCons, c);

        return maxVowel + maxCons;
    }

    //helper for getting vowels
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
