class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SimpleBinaryTree {
    Node root;

    // Function to insert a new node in level order
    public void insert(int data) {
        Node newNode = new Node(data);

        // If tree is empty → new node becomes root
        if (root == null) {
            root = newNode;
            return;
        }

        // Level order traversal to find first empty spot
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            // check left
            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            // check right
            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    // --- Inorder traversal (for checking tree content) ---
    public void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    // --- Demo ---
    public static void main(String[] args) {
        SimpleBinaryTree tree = new SimpleBinaryTree();

        // Insert using function
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        System.out.println("Inorder Traversal after Insertions:");
        tree.printInOrder(tree.root); // Output: 4 2 5 1 6 3 7
    }
}
