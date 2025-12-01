import java.util.Scanner;

public class Galaxy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                int a = sc.nextInt();
                sum += a;
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
        sc.close();
    }
}
