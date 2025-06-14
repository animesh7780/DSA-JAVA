public class PrimeNumber {
    boolean isPrime(int n){

        if(n==0 || n==1) return false;
        int count = 0;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                count++;
            }
        }

        if(count == 2) return true;
        return false;
    }
}
