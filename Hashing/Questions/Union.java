import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {7, 3, 9};
        int[] nums2 = {6, 3, 9, 2, 9, 4};
        System.out.println(unionSize(nums1, nums2));
    }
    public static int unionSize(int[] nums1, int[] nums2){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i < nums2.length; i++){
            set.add(nums2[i]);
        }
        return set.size();
    }
}
