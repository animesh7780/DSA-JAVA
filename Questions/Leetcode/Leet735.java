import java.util.Stack;

public class Leet735 {
    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        Leet735 obj = new Leet735();
        System.out.println(obj.asteroidCollision(asteroids).toString());
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            // While current asteroid is moving left and top of stack is moving right
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            // If current asteroid is not destroyed, push it to the stack
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert the stack to an array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
