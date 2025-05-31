public class AppearOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,3,4};
        System.out.println(appearOnce(arr));
    }   
    public static int appearOnce(int[] arr){
        int XOR = 0;
        for(int i = 0; i < arr.length; i++){
            XOR  = XOR ^ arr[i];
        }
        return XOR;
    }
}
