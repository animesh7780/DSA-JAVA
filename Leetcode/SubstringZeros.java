//we will just count when we get consecutive ones and then reset when we get something other than 0.

public class SubstringZeros {
    public int numSub(String s) {
        int n = s.length();
        long count = 0, res = 0;
        int MOD = 1_000_000_007;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                count++;
                res = (res + count) % MOD;
            }
            else{
                count = 0;
            }
        }
        return (int) res;
    }
}
