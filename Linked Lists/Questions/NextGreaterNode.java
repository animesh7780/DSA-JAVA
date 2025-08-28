public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        if(head == null) return null;
        int len = 0;
        
        while(head.next != null){
            head = head.next;
            len++;
        }

        int[] arr = new int[len];

        while(head.next != null){
            if(head.val < head.next.val){
                
            }
            else if()
            else{
                head.next = head.next.next;
            }
        }
    }
}
