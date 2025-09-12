public class MinimumJumps {
    public int minJumps(int[] arr) {
        int n = arr.length;
        // Edge case: If the array has 0 or 1 element, no jumps are needed.
        if (n <= 1) {
            return 0;
        }

        // Edge case: If the starting element is 0, we can't move.
        if (arr[0] == 0) {
            return -1;
        }

        int jumps = 1;
        int maxReach = arr[0];
        int steps = arr[0];

        for (int i = 1; i < n; i++) {
            // If we've reached the end, return the jumps.
            if (i == n - 1) {
                return jumps;
            }

            // Update maxReach to the farthest position we can reach.
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Use one step from the current jump.
            steps--;

            // If no more steps from the current jump, take a new jump.
            if (steps == 0) {
                jumps++;
                
                // If the current position is beyond our maximum reach, we can't proceed.
                if (i >= maxReach) {
                    return -1;
                }
                
                // Reset steps for the new jump.
                steps = maxReach - i;
            }
        }
        return -1; // Should not be reached in a valid path
    }
}
