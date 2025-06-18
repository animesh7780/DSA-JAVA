public class CountOccurence {
    int countOccurence(int[] arr, int n, int x){
        int findLeft = findLeft(arr, x);
        if(findLeft == -1) return 0;

        int findRigth = findRigth(arr, x);
        return findLeft+findRigth;
    }

    int findLeft(int[] arr, int x){
        int start = 0, end = arr.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result = mid;
                end = mid - 1; // Continue searching left
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

        int findRigth(int[] arr, int x){
        int start = 0, end = arr.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result = mid;
                start = mid + 1; // Continue searching right
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
