public class SmallestGoodBase {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        long maxM = (long)(Math.log(num) / Math.log(2));

        for(long m = maxM; m >= 1; m--){
            long left = 2;
            long right = (long) Math.pow(num, 1.0/m) + 1;

            while(left <= right){
                long mid = left + (right - left)/2;

                long sum = 1;
                long cur = 1;
                boolean overflow = false;
                for (int i = 1; i <= m; i++) {
                    cur *= mid;
                    if (cur < 0 || cur > num) { // overflow check
                        overflow = true;
                        break;
                    }
                    sum += cur;
                    if (sum > num) {
                        overflow = true;
                        break;
                    }
                }

                if (!overflow && sum == num) {
                    return String.valueOf(mid);
                } else if (overflow || sum > num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        // if no base found, return n-1
        return String.valueOf(num - 1);
    }
}
