import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String to Get prefix Sum");
        String s = sc.nextLine();

        int n = s.length();
        int[] prefixOnes = new int[n+1];
        int[] prefixZeros = new int[n+1];
        for(int i=0; i<n; i++){
            prefixOnes[i+1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
            prefixZeros[i+1] = prefixZeros[i] + (s.charAt(i) == '0' ? 1 : 0);
        }

        System.out.println(Arrays.toString(prefixZeros));
        System.out.println(Arrays.toString(prefixOnes));

        sc.close();
    }
}
