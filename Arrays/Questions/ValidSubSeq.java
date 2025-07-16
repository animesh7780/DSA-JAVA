public class ValidSubSeq {
    public int findLongestValidSubsequence(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;
        
        // There are only 4 possible patterns for valid subsequences:
        // 1. All even numbers (all consecutive sums are even)
        // 2. All odd numbers (all consecutive sums are even)
        // 3. Alternating even-odd-even... (all consecutive sums are odd)
        // 4. Alternating odd-even-odd... (all consecutive sums are odd)
        
        int maxLen = 1; // At least one element is always valid
        
        // Pattern 1: All even numbers
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        maxLen = Math.max(maxLen, evenCount);
        
        // Pattern 2: All odd numbers  
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                oddCount++;
            }
        }
        maxLen = Math.max(maxLen, oddCount);
        
        //for alternating ones we just toggle the odd even values to choosefrom alternating odd even values
        // Pattern 3: Alternating even-odd-even...
        int evenOddAlt = 0;
        boolean expectEven = true;
        for (int num : nums) {
            if (expectEven && num % 2 == 0) {
                evenOddAlt++;
                expectEven = false;
            } else if (!expectEven && num % 2 == 1) {
                evenOddAlt++;
                expectEven = true;
            }
        }
        maxLen = Math.max(maxLen, evenOddAlt);
        
        // Pattern 4: Alternating odd-even-odd...
        int oddEvenAlt = 0;
        boolean expectOdd = true;
        for (int num : nums) {
            if (expectOdd && num % 2 == 1) {
                oddEvenAlt++;
                expectOdd = false;
            } else if (!expectOdd && num % 2 == 0) {
                oddEvenAlt++;
                expectOdd = true;
            }
        }
        maxLen = Math.max(maxLen, oddEvenAlt);
        
        return maxLen;
    }
}
