public class GoodNumbers {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1, 5, 4 };
        int k = 2;
        GoodNumbers obj = new GoodNumbers();
        System.out.println(obj.sumOfGoodNumbers(nums, k));
    }

    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        
        for (int i = k; i < nums.length - k; i++) {
            if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) {
                sum += nums[i]; 
            }
        }
        return sum; 
    }
    
}
