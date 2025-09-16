public class StringStack {
    public boolean stringStack(String pat, String tar) {
        // code here
        int i = pat.length() - 1;
        int j = tar.length() - 1;

        while(i >= 0 && j >= 0){
            if (pat.charAt(i) != tar.charAt(i)) {
                i -= 2;
            }
            else{
                i--;
                j--;
            }
        }
        return j < 0;
    }
}
