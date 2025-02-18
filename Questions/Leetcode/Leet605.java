import java.util.Arrays;

public class Leet605 {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 0, 1 };
        int n = 2;
        System.out.println(new Leet605().canPlaceFlowers(flowerbed, n));
        System.out.println(Arrays.toString(flowerbed));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i < flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {
                    break;
                }
            }
        }
        if (n <= 0) {
            return true;
        }
        return false;
    }

    public boolean canPlaceFlowersI(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0 || i == flowerbed.length - 1)) {
                count++;
                flowerbed[i] = 1;
            }
            n--;
        }
        if (count == n) {
            return true;
        }
        return false;
    }
}
