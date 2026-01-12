public class SubstringWkDis {
    public int countSubstr(String s, int k) {
        //  code here
        if(k == 0)return 0;
        return atMostK(s, k) - atMostK(s, k-1);
    }

    private int atMostK(String s, int k){
        int[] freq = new int[26];
        int n = s.length();
        int left = 0;
        int dis = 0;
        int cnt = 0;
        
        for(int right=0; right<n; right++){
            int c = s.charAt(right) - 'a';

            if(freq[c] == 0) dis++;
            freq[c]++;

            while (dis > k) {
                int l = s.charAt(left) - 'a';
                freq[l]--;
                if(freq[l] == 0) dis--;
                left++;
            }
            cnt += (right - left + 1);
        }
        return cnt;
    }
}
