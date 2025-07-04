import java.util.Collections;
import java.util.HashMap;

public class Beauty {
    // public int beautySum(String s) {
    //     int n = s.length();
    //     int beauty = 0;

    //     for(int i=0; i<n; i++){
    //         for(int j=i; j<n; j++){
    //             String sub = s.substring(i, j+1);

    //             //count frequencies

    //             HashMap<Character, Integer> map = new HashMap<>();
    //             for(char c : sub.toCharArray()){
    //                 map.put(c, map.getOrDefault(c, 0)+1);
    //             }

    //             int maxFreq = Collections.max(map.values());
    //             int minFreq = Collections.min(map.values());

    //             beauty += (maxFreq - minFreq);
    //         }
    //     }
    //     return beauty;
    // }

    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for(int i = 0; i < n; i++){
            int[] freq = new int[26]; // For lowercase letters
            
            for(int j = i; j < n; j++){
                // Add current character to frequency array
                freq[s.charAt(j) - 'a']++;
                
                // Find max and min frequencies
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }
                
                // Add beauty value
                totalBeauty += (maxFreq - minFreq);
            }
        }
        return totalBeauty;
    }
}
