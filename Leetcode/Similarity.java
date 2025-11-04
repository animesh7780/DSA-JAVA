import java.util.HashSet;
import java.util.List;

public class Similarity {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length; i++){
            set.add(nums[i]);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null){
            if(set.contains(curr.next.val)){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}

