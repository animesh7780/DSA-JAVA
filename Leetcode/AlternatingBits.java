public class AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        int m = bin.length();
        
        for(int i = 1; i < m; i++){
            if(bin.charAt(i) == bin.charAt(i - 1)){
                return false;
            }
        }
        
        return true;
    }
}
