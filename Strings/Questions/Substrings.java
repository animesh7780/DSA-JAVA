public class Substrings {
    public int countSubstrings(String s){
        int n = s.length();

        return n*(n+1)/2;
    }
}
