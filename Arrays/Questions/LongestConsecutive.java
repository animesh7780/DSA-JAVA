import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Longest consecutive sequence length: " + lengthOfSequence(arr1));
        System.out.println("Sequence: [1, 2, 3, 4]");
        System.out.println();
    }
    public static int lengthOfSequence(int[] arr){
        int n = arr.length;
        if (n == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        
        // Add all elements to the set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        // Iterate through each element in the set
        for (int item : set) {
            // Check if this is the start of a sequence
            // (i.e., item-1 is not present in the set)
            if (!set.contains(item - 1)) {
                int cnt = 1;
                int x = item;
                
                // Count consecutive elements starting from 'item'
                while (set.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                
                // Update the longest sequence length
                longest = Math.max(longest, cnt);
            }
        }
        
        return longest;
    }
}
