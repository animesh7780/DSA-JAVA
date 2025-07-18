public class MinWindowSubString {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length()){
            return "";
        }

        int[] tcount = new int[128];
        for(char c : t.toCharArray()){
            tcount[c]++;
        }

        int left = 0, minLen = Integer.MAX_VALUE;
        int minStart = 0; //starting index of window
        int req = t.length();

        for(int right=0; right<s.length(); right++){
            char rightChar = s.charAt(right);

            //if character is needed, decrement req count
            if(tcount[rightChar] > 0){
                req--;
            }

            tcount[rightChar]--;//Always decrement count window

            // When we have a valid window (all characters matched)
            while (req == 0) {
                // Update minimum window if current is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                
                // Try to shrink window from left
                char leftChar = s.charAt(left);
                tcount[leftChar]++; // Add back the character we're removing
                
                // If removing this character breaks our window
                if (tcount[leftChar] > 0) {
                    req++;
                }
                
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}

