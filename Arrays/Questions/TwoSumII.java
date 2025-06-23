import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length - 1;
         
        int left = 0;
        int right = n;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
            return new int[]{left + 1, right + 1}; // 1-indexed as per problem
            }
            else if(sum < target) left++;
            else right--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,7,5};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
