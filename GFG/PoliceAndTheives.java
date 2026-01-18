public class PoliceAndTheives {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        int i=0, j=0;
        int cnt = 0;

        while(i < n && arr[i] != 'P') i++;
        while(j < n && arr[j] != 'T') j++;

        while(i<n && j<n){
            if(Math.abs(i - j) <= k){
                cnt++;
                i++;
                j++;
            
            while(i < n && arr[i] != 'P') i++;
            while(j < n && arr[j] != 'T') j++;

            }

            else if(i > j){
                j++;
                while (j<n && arr[j] != 'T') j++;
            }

            else{
                i++;
                while(i<n && arr[i] != 'P') i++;
            }
        }
        return cnt;
    }
}
