import java.util.Arrays;
import java.util.TreeSet;

public class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        if(nums.length < 3){
            Arrays.sort(nums);
            return(nums[n - 1]);
        }

        //using a tree set allows to get the values we want
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
            //if we find elements greater than the three we remove the first one
            if(set.size() > 3){
                set.pollFirst();
            }
        }

        //if we find a set with size less than 3 we return the max element
        if(set.size() < 3){
            return set.last();
        }

        //when we have done making the set we return the first element as 
        //we only have the three max elements and return the third one
        return set.first();
    }
}
