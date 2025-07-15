public class MedianOfSortedArray{
    int findMedian(int[] arr1, int[] arr2, int n, int m) {
        int totalLength = n + m;
        int medianPos = totalLength / 2;
        
        int i = 0, j = 0, count = 0;
        int result = 0, prevResult = 0;
        
        while (count <= medianPos) {
            prevResult = result;
            
            // Choose smaller element from both arrays
            if (i < n && (j >= m || arr1[i] <= arr2[j])) {
                result = arr1[i++];
            } else {
                result = arr2[j++];
            }
            
            count++;
            
            // Break when we reach median position
            if (count > medianPos) {
                break;
            }
        }
        
        // Return median based on odd/even length
        if (totalLength % 2 == 1) {
            return result;
        } else {
            return (prevResult + result) / 2;
        }
    }
}