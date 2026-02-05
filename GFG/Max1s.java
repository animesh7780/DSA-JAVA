public class Max1s {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int left = 0;
        int maxLen = 0;

        for(int right=0; right<n; right++){
            if(arr[right] == 0) k--;
            while(k < 0){
                if(arr[left] == 0){
                    k++;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }    
}
