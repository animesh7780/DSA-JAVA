public class Leet410 {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 5, 10, 8 };
        int m = 2;
        System.out.println(new Leet410().splitArray(arr, m));
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // calculate how many peices you can divide this array

            int sum = 0;
            int peices = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // cannot add this number to the current peice
                    sum = num;
                    peices++;
                } else {
                    sum += num;
                }
            }
            if (peices > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
