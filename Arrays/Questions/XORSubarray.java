public class XORSubarray {
    int findNoOfSUb(int[] arr, int k){
        int n = arr.length;
        int countXOR = 0;

        for(int i=0; i<n; i++){
            int xor = 0;
            for(int j=i; j<n; j++){
                xor = xor ^ arr[j];
            }
            if(xor == k){
                countXOR++;
            }
        }
        return countXOR;
    }
}
