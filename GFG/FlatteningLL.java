public class FlatteningLL {
    // public Node flatten(Node root) {
    //     // code here
    //     Node ans = new Node(0);
    //     Node tail = ans;
    //     Node curr = root;

    //     while(curr != null){
    //         tail.next = curr;
    //         tail = tail.next;
    //         if(curr. bottom != null){
    //             Node bot = curr.bottom;
    //             while(bot != null){
    //                 tail.next = bot;
    //                 bot = bot.next;
    //             }
    //         }
    //         curr = curr.next;
    //     }
    //     return sortList(ans.next);
    // }

    // private Node sortList(Node head) {
    //     if (head == null || head.next == null) return head;
        
    //     // Step 1: Find middle using slow/fast pointers
    //     Node slow = head, fast = head, prev = null;
    //     while (fast != null && fast.next != null) {
    //         prev = slow;
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
        
    //     // Step 2: Split list
    //     prev.next = null;
    //     Node right = sortList(slow);
    //     Node left = sortList(head);
        
    //     // Step 3: Merge sorted halves
    //     return merge(left, right);
    // }
    
    // private Node merge(Node a, Node b) {
    //     Node dummy = new Node(0);
    //     Node tail = dummy;
        
    //     while (a != null && b != null) {
    //         if (a.data <= b.data) {
    //             tail.next = a;
    //             a = a.next;
    //         } else {
    //             tail.next = b;
    //             b = b.next;
    //         }
    //         tail = tail.next;
    //     }
        
    //     tail.next = (a != null) ? a : b;
    //     return dummy.next;
    // }

    static Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }
        
        root.next = flatten(root.next);
        root = merge(root, root.next);
        
        return root;
    }


    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        
        if (a.data <= b.data) {
            a.bottom = merge(a.bottom, b);
            return a;
        } else {
            b.bottom = merge(a, b.bottom);
            return b;
        }
    }

}
