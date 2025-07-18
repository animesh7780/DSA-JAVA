public class RemoveDuplicates {
    public ListNode removeDuplicates(ListNode head) {
        ListNode curr = head;

        while(curr.next != null){
            if(curr.val == curr.next.val){
                ListNode dupli = curr.next;//getting duplicate
                curr.next = dupli.next;//and assigning it to other vriable means removing it
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}