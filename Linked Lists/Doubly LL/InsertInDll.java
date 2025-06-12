public class InsertInDll {
    
    // Insert at end of DLL
    Node insertInDLL(Node root, int n) {
        Node node = new Node(n);
        
        // If list is empty
        if (root == null) {
            return node;
        }
        
        Node curr = root;
        // Traverse to last node
        while (curr.next != null) {
            curr = curr.next;
        }
        
        // Insert at end
        curr.next = node;
        node.back = curr;
        
        return root;  // Return head of list
    }
}

class InsertAtFirst{
    Node insertAtfirst(Node root, int n){
        Node node = new Node(n);
        Node curr = root;

                // If list is empty
        if (root == null) {
            return node;
        }

        node.next = curr;
        node.back = null;

        return node;

    }
}


class Node {
    public int data;       // Data stored in the node
    public Node next;      // Reference to the next node in the list (forward direction)
    public Node back;      // Reference to the previous node in the list (backward direction)

    // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
