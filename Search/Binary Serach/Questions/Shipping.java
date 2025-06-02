public class Shipping {
    public static void main(String[] args) {
        
    }

    public static int possibleCap(int[] arr, int cap){
        int days = 1;
        int load = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] + load > cap){
                days = days + 1;
                load = arr[i];
            }else{
                load = load + arr[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = maxEle(weights);
        int high = sumEle(weights);

        while(low <= high){

            int mid = low + (high - low) / 2;
            int noOfdays = possibleCap(weights, mid);

            if(noOfdays <= days){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    } 

    public static int maxEle(int[] arr){
        int n = arr[0];
        for(int i = 0; i < arr.length; i++){
            n = Math.max(n,arr[i]);
        }
        return n;
    }

    public static int sumEle(int[] arr){
    int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
