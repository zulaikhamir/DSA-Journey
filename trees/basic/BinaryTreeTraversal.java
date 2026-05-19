class Node {
    int key;
    Node left, right;

    /**
     * Creates a node with the specified key and null left and right children.
     *
     * @param item the integer key to store in this node
     */
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTreeTraversal {
    Node root;

    /**
     * Constructs an empty binary tree with no root node.
     *
     * The `root` field is initialized to `null`.
     */
    BinaryTreeTraversal() {
        root = null;
    }

    /**
     * Performs an inorder traversal of the subtree rooted at the given node and prints each node's key to standard output separated by spaces.
     *
     * @param node the root of the subtree to traverse; may be null
     */
    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    /**
     * Prints the keys of the subtree rooted at the given node in preorder (root, left, right).
     *
     * Output is written to System.out with keys separated by a single space.
     *
     * @param node the root of the subtree to traverse; if `null`, nothing is printed
     */
    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    /**
     * Performs a postorder traversal of the subtree rooted at the given node and prints each node's key.
     *
     * Prints each visited node's `key` to standard output separated by a single space. If `node` is `null`, nothing is printed.
     *
     * @param node the root of the subtree to traverse; may be `null`
     */
    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    /**
     * Builds a sample binary tree and prints its inorder, preorder, and postorder traversals.
     *
     * <p>The constructed tree is:
     * <pre>
     *     1
     *    / \
     *   2   3
     *  / \
     * 4   5
     * </pre>
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.printInorder(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.printPreorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.printPostorder(tree.root);
    }
}
