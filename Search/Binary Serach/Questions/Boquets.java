public class Boquets {
    public static void main(String[] args) {
        
    }

    public static boolean possibleBoquets(int[] bloomDay, int day, int k, int m){
        int cnt = 0;
        int noOfBq = 0;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                cnt++;
            }
            else{
                noOfBq += cnt/k;
                cnt = 0;
            }
        }
        noOfBq += cnt/k;
        return noOfBq >= m; 
    }

    public static int minDays(int[] bloomDay, int m, int k){

        long total = (long) m * k;
        if(total > bloomDay.length) return -1;

        int low = minEle(bloomDay);
        int high = maxEle(bloomDay);

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(possibleBoquets(bloomDay, mid, k, m)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static int minEle(int[] arr){
        int n = arr[0];
        for(int i = 0; i < arr.length; i++){
            n = Math.min(n,arr[i]);
        }
        return n;
    } 

    public static int maxEle(int[] arr){
        int n = arr[0];
        for(int i = 0; i < arr.length; i++){
            n = Math.max(n,arr[i]);
        }
        return n;
    } 
}
