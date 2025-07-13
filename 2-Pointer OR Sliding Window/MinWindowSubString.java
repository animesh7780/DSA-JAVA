public class MinWindowSubString {
    public String minWindow(String s, String t) {
        int left = 0, minLen = Integer.MAX_VALUE;
        String res = "";
        int n = s.length();

        for(int right=0; right<n; right++){
            int len = 0;
            if(s.contains(t)){
                len = right - left + 1;
                minLen = Math.min(minLen, len);
                res += right;
            }
        }
    }
}
