public class Rearrange {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int size = 0;
        int size1 = 1;

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                arr[size] = nums[i];
                size = size + 2;
            }
            else{
                arr[size1] = nums[i];
                size1 = size1 + 2;
            }
        }
        return arr;
    }
}
