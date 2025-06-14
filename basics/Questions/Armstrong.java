public class Armstrong {
    boolean isArmstrong(int n){
        int orig = n;
        int power = countDigits(n);
        double ans = 0;

        while(n != 0){
            int digit = n%10;
            ans = ans + Math.pow(digit, power);
            n = n/10;
        }
        if(ans == orig) return true;
        return false;
    }

    public int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n/10; 
        }
        return count;
    }
}
