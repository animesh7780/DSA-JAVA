public class Multiply{
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        int newN = original;
        boolean found;

        do{
            found = false;
            for(int num : nums){
                if(num == newN){
                    newN *= 2;
                    found = true;
                }
            }
        }
        while(found);
        return newN;
    }
}