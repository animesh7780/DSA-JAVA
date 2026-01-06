public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for(int num : nums){
            int cnt = 0;
            int sum = 0;
            int limit = (int) Math.sqrt(num);

            for(int d=1; d<=limit; d++){
            if (num % d == 0) {
                int other = num / d;

                // d is a divisor
                cnt++;
                sum += d;

                // paired divisor (avoid double-counting when d*d == num)
                if (other != d) {
                    cnt++;
                    sum += other;
                }

                // early stop if more than 4 divisors
                if (cnt > 4) break;
            }
        }
        if (cnt == 4) ans += sum;
        }
        return ans;
    }
}
