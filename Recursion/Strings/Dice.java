public class Dice {
    public static void main(String[] args) {
        diceSum("", 3, 8);
    }

    static void diceSum(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceSum(p + i, target - i, face);
        }
    }
}
