public class StringRotation{
    public boolean areRotations(String s1, String s2) {
        // code here
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;

        String doub = s1 + s1;

        if(doub.contains(s2)) return true;

        return false;
    }
}