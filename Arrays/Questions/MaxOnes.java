public class MaxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1,1};
        System.out.println(maxOnes(arr));
    }
    public static int maxOnes(int[] arr){
        int max = 0;
        int count = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
