import java.util.Arrays;

public class AssignCookies{
    public int findContentChildren(int[] g, int[] s) {
        // Sort both arrays to use greedy approach
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child = 0;  // pointer for children (greed array)
        int cookie = 0; // pointer for cookies (size array)
        
        // Use two pointers approach
        while (child < g.length && cookie < s.length) {
            // If current cookie can satisfy current child
            if (s[cookie] >= g[child]) {
                child++; // move to next child
            }
            cookie++; // always move to next cookie
        }
        
        return child;
    }
}