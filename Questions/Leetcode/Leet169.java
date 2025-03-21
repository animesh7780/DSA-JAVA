public class Leet169 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElementII(arr));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0; // Reset count for each new element
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i]; // Majority element found
            }
        }
        return -1;
    }

    public static int majorityElementII(int[] nums) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                ele = nums[i];
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}
