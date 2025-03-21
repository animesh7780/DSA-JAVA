import java.util.Stack;

public class Leet682 {
    public static void main(String[] args) {
        String[] scores = { "5", "2", "C", "D", "+" };
        Leet682 obj = new Leet682();
        System.out.println(obj.calPoints(scores));
    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                sum -= stack.pop();
            }
            if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            }
            if (operations[i].equals("+")) {
                stack.push(Integer.parseInt(operations[i + 1]));
                sum += stack.peek();
                i++;
            } else {
                stack.push(Integer.parseInt(operations[i]));
                sum += stack.peek();
            }
        }
        return sum;
    }
}
