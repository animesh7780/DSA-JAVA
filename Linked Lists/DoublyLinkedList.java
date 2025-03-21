import org.w3c.dom.Node;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.prev = null;
            node.next = null;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void insertLastWithoutTail(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.prev = null;
            node.next = null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insertAtIndex(int value, int after) {
        Node p = findValue(after);
        if (p == null) {
            System.out.println("Value not found");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node findValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->" + " ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertLastWithoutTail(44);
        dll.insertAtIndex(3, 2);
        dll.display();
    }

}
