import java.util.LinkedList;
import java.util.Queue;

public class Leet860 {
    public static void main(String[] args) {
        int[] bilss = { 10, 20, 20 };
        Leet860 obj = new Leet860();
        boolean ans = obj.lemonadeChange(bilss);
        System.out.println(ans);
    }

    public boolean lemonadeChange(int[] bills) {
        Queue<Integer> queue = new LinkedList<>();
        int lemonadeCost = 5;
        int balance = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == lemonadeCost) {
                queue.add(bills[i] + balance);
            } else if (bills[i] > lemonadeCost) {

            }
        }
        if (queue.isEmpty())
            return false;
        return true;
    }
}
