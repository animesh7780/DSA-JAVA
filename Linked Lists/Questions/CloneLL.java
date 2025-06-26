public class CloneLL {
    public Node cloneList(Node head) {
        if (head == null) return null;
    
        // Step 1: Create copy nodes and interweave them
        Node temp = head;
        while (temp != null) {
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
        
        // Step 2: Set random pointers for copy nodes
        Node temp2 = head;
        while(temp2 != null){
            Node copyNode = temp2.next;
            // Fix: Check if random pointer exists before accessing .next
            if (temp2.random != null) {
                copyNode.random = temp2.random.next;
            }
            // If temp2.random is null, copyNode.random remains null (default)
            temp2 = temp2.next.next;
        }
        
        // Step 3: Separate the original and copied lists
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        Node temp3 = head;
        while (temp3 != null) {
            res.next = temp3.next;
            temp3.next = temp3.next.next;
            res = res.next;
            temp3 = temp3.next;
        }
        
        return dummyNode.next;
    }
}

class Node {
    public int val;       // val stored in the Node
    public Node next;      // Reference to the next Node in the list (forward direction)
    public Node back;      // Reference to the previous Node in the list (backward direction)
    public Node random;

    // Constructor for a Node with both val, a reference to the next Node, and a reference to the previous Node
    public Node(int val, Node next, Node back, Node random) {
        this.val = val;
        this.next = next;
        this.back = back;
        this.random = random; 
    }

    // Constructor for a Node with val, and no references to the next and previous Nodes (end of the list)
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.back = null;
        this.random = null;
    }
}