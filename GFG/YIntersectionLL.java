public class YIntersectionLL {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int l1 = lengthOfLL(head1);
        int l2 = lengthOfLL(head2);

        int diff = Math.abs(l1 - l2);
        Node p1 = head1;
        Node p2 = head2;

        if(l1 > l2){
            while(diff-- > 0){
                p1 = p1.next;
            }
        }
        else{
            while(diff-- > 0){
                p2 = p2.next;
            }
        }

        while(p1 != null && p2 != null){
            if(p1 == p2) return p1;

            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    private int lengthOfLL(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}
