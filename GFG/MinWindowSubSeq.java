public class MinWindowSubSeq {
    public String minWindow(String s1, String s2) {
        // code here
        int n = s1.length(), m = s2.length();
        int minL = Integer.MAX_VALUE;
        int start = -1;

        int i=0;
        while(i < n){
            int j = 0;
            
            while(i < n){
                if(s1.charAt(i) == s2.charAt(i)){
                    j++;
                    if(j == m) break;
                }
                i++;
            }
            if(j < m) break;

            int back = i;
            j = m-1;

            while(i >= 0){
                if(s1.charAt(i) == s2.charAt(i)){
                    j--;
                    if(j < 0) break;
                }
                i--;
            }

            int ws = i+1;
            int len = back - ws + 1;
            if(len < minL){
                minL = len;
                start = ws;
            }

            i = ws + 1;
        }
        if(start == -1) return "";

        return s1.substring(start, start+minL);
    }
}
