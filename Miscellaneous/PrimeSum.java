import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++){
            for(int j=n-1; j>=n/2; j--){
                int sum = i+j;
                if(isPrime(i) && isPrime(j) && sum == n){
                    System.out.println("Sum");
                }
            }
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime
        }
        if (n % 2 == 0) {
            return false; // eliminate even numbers
        }
        
        // check for factors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
