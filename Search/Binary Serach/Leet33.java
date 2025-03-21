public class Leet33 {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 7, 0, 1, 2 };
        int target = 7;
        System.out.println(new Leet33().search(arr, target));
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) { // mid<end is important
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) { // mid>start is important
                return mid - 1;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] <= target) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    static int binary(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
