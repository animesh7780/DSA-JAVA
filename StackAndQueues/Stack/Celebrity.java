public class Celebrity {
    int findCeleb(int[][] arr) {
        int n = arr.length;
        int top = 0;
        int bottom = n - 1;
        
        // Find potential celebrity candidate
        while (top < bottom) {
            if (arr[top][bottom] == 1) {
                // top knows bottom, so top cannot be celebrity
                top++;
            }else{
                // top doesn't know bottom, so bottom can't be celebrity
                // We only eliminate bottom here, not both!
                bottom--;
            }
        }
        
        // Verify if candidate is actually a celebrity
        for (int i = 0; i < n; i++) {
            if (i == top) continue;
            
            // Celebrity should not know anyone AND everyone should know celebrity
            if (arr[top][i] == 1 || arr[i][top] == 0) {
                return -1;
            }
        }
        
        return top;
    }
}