public class Leet27 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        Leet27 obj = new Leet27();
        System.out.println(obj.removeElement(arr, val));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
