public class LinkedList {

    private class LL {

        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.size = 0;
        }

        public void inserrtFirst(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }

            size++;
        }

        public void insertLast(int value) {
            if (tail == null) {
                tail = new Node(value);
                head = tail;
            } else {
                tail.next = new Node(value);
                tail = tail.next;
            }
        }

        public void insertAtIndex(int value, int index) {
            if (index == 0) {
                inserrtFirst(value);
            } else if (index == size) {
                insertLast(value);
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }

        public int deleteFirst() {
            int value = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return value;
        }

        public int deleteLast() {
            if (size <= 1) {
                return deleteFirst();
            }
            Node secondLast = get(size - 1);
            int value = tail.value;
            tail = secondLast;
            tail.next = null;
            size--;
            return value;
        }

        public int deleteAtIndex(int index) {
            if (index == 0) {
                return deleteFirst();
            } else if (index == size - 1) {
                return deleteLast();
            }
            Node temp = get(index - 1);
            int value = temp.next.value;
            temp.next = temp.next.next;
            size--;
            return value;
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

        // get index
        public Node get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void Display() {
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

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList.LL list = ll.new LL();
        list.inserrtFirst(10);
        list.inserrtFirst(20);
        list.inserrtFirst(30);
        list.insertLast(40);
        list.insertAtIndex(50, 2);
        list.deleteFirst();
        list.deleteLast();
        list.deleteAtIndex(1);
        list.findValue(20);
        list.Display();
    }
}