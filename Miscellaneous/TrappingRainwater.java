// we are creating two arrays that contain max at that point comparing them to the last,
// help us comparing them to find the smaller one that helps us to find the wate level


import java.util.Scanner;

public class TrappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        int total = 0;

        int[] leftMax = prefixMax(height);
        int[] rightMax = suffixMax(height);

        for(int i=0; i<n; i++){
            int waterLvl = Math.min(leftMax[i], rightMax[i]);
            total += Math.max(0, waterLvl - height[i]);
        }

        return total;

    }

    static int[] prefixMax(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i=1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1], arr[i]);
        }
        return prefix;
    }

    static int[] suffixMax(int[] arr){
        int n = arr.length;
        int[] suffix = new int[n];

        suffix[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1], arr[i]);
        }
        return suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elevations");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elevations");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Total trpped water"+ "=" + trap(arr));
        sc.close();
    }
}
