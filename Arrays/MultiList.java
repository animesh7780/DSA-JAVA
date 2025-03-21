import java.util.ArrayList;
import java.util.Scanner;

public class MultiList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<ArrayList<Integer>>(3);
        for (int i = 0; i < 4; i++) {
            multiList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(multiList);
        sc.close();
    }
}
