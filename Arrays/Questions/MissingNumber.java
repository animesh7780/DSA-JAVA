public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingNumber(arr, 5));
    }
    public static int missingNumber(int[] arr, int N){
        int n = N-1;
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i = 0; i < n; i++){
            XOR2 = XOR2 ^ arr[i];
            XOR1 = XOR1 ^ (i+1);
        }
        XOR1 = XOR1 ^ N;
        return XOR1 ^ XOR2;
    }
}
