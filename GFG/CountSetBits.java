public class CountSetBits {
    public static int countSetBits(int n) {
        // code here
        int cnt = 0;
        for(int i=1; i<=n; i++){
            cnt += setBits(i);
        }
        return cnt;
    }
    static int setBits(int n){
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
