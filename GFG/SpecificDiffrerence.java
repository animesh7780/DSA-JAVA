public class SpecificDiffrerence {
    public int getCount(int n, int d) {
        // code here
        int low = 1, high = n;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            
            int value = mid - digitSum(mid);

            if(value >= d){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(ans == -1) return 0;

        return n - ans + 1;
    }

    private int digitSum(long x){
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
