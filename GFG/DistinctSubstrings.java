import java.util.HashSet;
import java.util.Set;

public class DistinctSubstrings {
    public static int countSubs(String s) {
        // code here
        int n = s.length();
        Set<String> subStrings = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                subStrings.add(s.substring(i,j));
            }
        }
        return subStrings.size();
    }
}
