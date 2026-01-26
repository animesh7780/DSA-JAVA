public class JoshephusProblem {
    public int josephus(int n, int k) {
        // code here
        int res = 0;

        for(int i=0; i<n; i++){
            res = (res + k) % i;
        }
        return res + 1;
    }
}
