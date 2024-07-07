import java.util.Random;

class Node {
    int key, priority;
    Node left, right;

    public Node(int key, int priority) {
        this.key = key;
        this.priority = priority;
        this.left = this.right = null;
    }
}

public class Treap {
    private Node root;
    private Random random;

    public Treap() {
        this.root = null;
        this.random = new Random();
    }

    // Perform right rotation
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        return x;
    }

    // Perform left rotation
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        return y;
    }

    // Insert a key with a given priority into the Treap
    private Node insert(Node root, int key, int priority) {
        if (root == null) {
            return new Node(key, priority);
        }

        if (key < root.key) {
            root.left = insert(root.left, key, priority);

            if (root.left.priority < root.priority) {
                root = rotateRight(root);
            }
        } else if (key > root.key) {
            root.right = insert(root.right, key, priority);

            if (root.right.priority < root.priority) {
                root = rotateLeft(root);
            }
        }

        return root;
    }

    // Public method to insert a key into the Treap
    public void insert(int key) {
        int priority = random.nextInt(10);
        root = insert(root, key, priority);
    }

    // Perform in-order traversal of the Treap
    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println("Key: " + root.key + ", Priority: " + root.priority);
            inorderTraversal(root.right);
        }
    }

    // Public method to perform in-order traversal
    public void inorderTraversal() {
        System.out.println("In-order Traversal of the Treap:");
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        Treap treap = new Treap();

        // Inserting nodes into the Treap
        treap.insert(10);
        treap.insert(12);
        treap.insert(19);
        treap.insert(1);
        treap.insert(3);
        treap.insert(14);
        treap.insert(4);
        treap.insert(20);
        treap.insert(21);
        treap.insert(22);



        // Printing the in-order traversal of the Treap
        treap.inorderTraversal();
    }
}