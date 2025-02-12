import java.util.Stack;

public class Leet739 {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        Leet739 obj = new Leet739();
        int[] ans = obj.dailyTemperatures(temperatures);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
