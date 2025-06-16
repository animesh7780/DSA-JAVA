public class All3Characters {
    int maxLenSubstring(String S){
        int[] lastSeen = {-1,-1,-1};
        int n = S.length();
        int count = 0;

        for(int i=0; i<n; i++){
            lastSeen[S.charAt(i) - 'a'] = i;

            // If we've seen all three characters
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                // Find the minimum position among the three characters
                int minPos = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                // Add the number of valid substrings ending at position i
                count += (minPos + 1);
            }
        
        }
        return count;
    }
}
