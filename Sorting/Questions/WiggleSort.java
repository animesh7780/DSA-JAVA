import java.util.Arrays;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Arrays.sort(nums);
        reverse(nums);

        int evenInd = 0;
        int oddInd = 1;

        for (int i = 0; i < n; i++) {
            if (oddInd < n) {
                res[oddInd] = nums[i];
                oddInd += 2;
            } else if (evenInd < n) {
                res[evenInd] = nums[i];
                evenInd += 2;
            }
        }
    }

    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
