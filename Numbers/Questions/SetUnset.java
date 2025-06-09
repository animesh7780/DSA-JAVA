public class SetUnset {
    public static void main(String[] args) {
        
    }

    int setUnset(int n){
        int rightMostBit = n & 1;
        if(rightMostBit == 1){
            return n & ~1;
        }
        return n | 1;
    }
}
