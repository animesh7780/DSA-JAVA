public class AVL {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
        this.root = null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        } else {
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // Left heavy
            if (height(node.left.left) >= height(node.left.right)) {
                // Left-left case
                return rightRotate(node);
            } else {
                // Left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.right) - height(node.left) > 1) {
            // Right heavy
            if (height(node.right.right) >= height(node.right.left)) {
                // Right-right case
                return leftRotate(node);
            } else {
                // Right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "");
    }

    public void populateSorted(int[] values) {
        populateSorted(values, 0, values.length - 1);
    }

    private void populateSorted(int[] values, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        insert(values[mid]);
        populateSorted(values, start, mid - 1);
        populateSorted(values, mid + 1, end);
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.getValue());
        display(node.left, indent + "  ");
        display(node.right, indent + "  ");
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getValue());
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.getValue());
        inorder(node.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.getValue());
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println("Tree balanced: " + tree.balanced());
        System.out.println("Tree height: " + tree.height(tree.root));
    }

}