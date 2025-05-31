public class NextPremutation{
    public static void main(String[] args) {
        
    }
public static void nextPermutation(int[] arr) {
    int n = arr.length;
    int ind = -1;
    
    // Step 1: Find the rightmost character that is smaller than its next character
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            ind = i;
            break;
        }
    }
    
    // If no such character is found, the array is in descending order
    // Reverse it to get the smallest permutation
    if (ind == -1) {
        reverse(arr, 0, n - 1);
        return; // Important: return here as we're done
    }
    
    // Step 2: Find the rightmost character greater than arr[ind]
    for (int i = n - 1; i >= 0; i--) {
        if (arr[i] > arr[ind]) {
            swapNos(arr, i, ind);
            break;
        }
    }
    
    // Step 3: Reverse the suffix starting at ind + 1
    reverse(arr, ind + 1, n - 1);
}

public static void swapNos(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
}