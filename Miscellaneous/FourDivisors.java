public class FourDivisors {
    public static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            if (num == 1) continue;  // 1 has only one divisor
            int cnt = 0;
            int sum = 0;
            int limit = (int)Math.sqrt(num);

            for(int i=1; i<limit; i++){
                if(num % i == 0){
                    //here pair is the pairs of divisor of the number like
                    // 1, 21 then 3,7 then 21, 1
                    int pair = num / i;

                    cnt++;
                    sum += i;

                    if(pair != i){
                        cnt++;
                        sum += pair;
                    }
                    if(cnt > 4) break;
                }
            }
            if(cnt == 4) ans += sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {21, 4, 7};
        int div = sumFourDivisors(nums);
        System.out.println(div);
    }
}
