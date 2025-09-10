public class OneSwap {
    public int maximumSwap(int num) {
        String s = Integer.toString(num);
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
                break;
            }
        }
        return Integer.parseInt(new String(d));
    }
}
