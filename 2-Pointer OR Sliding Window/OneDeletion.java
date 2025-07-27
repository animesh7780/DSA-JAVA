public class OneDeletion {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        
        // Forward pass: maximum subarray sum ending at each position
        int[] maxEndingHere = new int[n];
        maxEndingHere[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxEndingHere[i] = Math.max(arr[i], maxEndingHere[i-1] + arr[i]);
        }
        
        // Backward pass: maximum subarray sum starting at each position
        int[] maxStartingHere = new int[n];
        maxStartingHere[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxStartingHere[i] = Math.max(arr[i], maxStartingHere[i+1] + arr[i]);
        }
        
        // Case 1: No deletion (standard Kadane's algorithm)
        int maxWithoutDeletion = maxEndingHere[0];
        for (int i = 1; i < n; i++) {
            maxWithoutDeletion = Math.max(maxWithoutDeletion, maxEndingHere[i]);
        }
        
        // Case 2: Delete one element
        int maxWithDeletion = Integer.MIN_VALUE;
        
        // Delete element at position i (for i = 0 to n-1)
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                // Delete first element, take max subarray from rest
                if (n > 1) {
                    maxWithDeletion = Math.max(maxWithDeletion, maxStartingHere[1]);
                }
            } else if (i == n-1) {
                // Delete last element, take max subarray from beginning
                maxWithDeletion = Math.max(maxWithDeletion, maxEndingHere[n-2]);
            } else {
                // Delete middle element, connect left and right parts
                maxWithDeletion = Math.max(maxWithDeletion, 
                                         maxEndingHere[i-1] + maxStartingHere[i+1]);
            }
        }
        
        return Math.max(maxWithoutDeletion, maxWithDeletion);
    }
}
