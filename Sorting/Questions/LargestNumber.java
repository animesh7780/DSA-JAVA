import java.util.Arrays;
/*
Sort the array with a custom comparator: For two numbers a and b, compare which order gives a bigger concatenated result:

    Compare ab vs ba (as strings).

    Place the one which gives a larger number in front.

 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        String asStr[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            asStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(asStr, (a,b) -> (b+a).compareTo(a+b));

        if(asStr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String s : asStr){
            sb.append(s);
        }
        return sb.toString();
    }
}
