import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int m = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            if(checkStrings(s, t)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean checkStrings(String s, String t){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
