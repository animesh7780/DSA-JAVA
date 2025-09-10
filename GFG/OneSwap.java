public class OneSwap {
    public String largestSwap(String s) {
        // code here
        char[] d = s.toCharArray();
        int n = d.length;

        int[] idx = new int[n];
        int maxPos = n-1;
        idx[n-1] = n-1;

        for(int i=n-2; i>=0; i--){
            if(d[i] > d[maxPos]) maxPos = i;
            idx[i] = maxPos;
        }

        for(int i=0; i<n; i++){
            int h = idx[i];
            if(d[i] < d[h]){
                char t = d[i];
                d[i] = d[h];
                d[h] = t;

                return new String(d);
            }
        }
        return s;
    }
}
