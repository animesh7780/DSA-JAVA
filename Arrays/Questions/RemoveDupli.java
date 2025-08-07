public class RemoveDupli {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 1;      // write pointer; first element always valid
        int count = 1;  // count of current element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1; // new number found, reset count
            }

            // Only keep if this number hasn't appeared more than twice
            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
