class Node {
    int key;
    Node left, right;

    /**
     * Constructs a node with the specified key and null left and right children.
     *
     * @param item the integer key to store in this node
     */
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTSearch {
    Node root;

    /**
     * Searches for a node with the specified key in the given subtree.
     *
     * @param root the root of the subtree to search; may be {@code null}
     * @param key  the key value to locate
     * @return     the {@code Node} containing {@code key}, or {@code null} if not found
     */
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key < key)
            return search(root.right, key);

        return search(root.left, key);
    }

    /**
     * Inserts the given key into the binary search tree rooted at the specified node.
     *
     * If the key already exists in the tree, the structure is unchanged.
     *
     * @param root the root of the subtree into which to insert the key; may be {@code null}
     * @param key  the value to insert
     * @return     the root of the subtree after insertion (a newly created node if {@code root} was {@code null})
     */
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    /**
     * Builds a sample binary search tree, searches for the value 60, and prints whether it was found.
     *
     * Inserts the keys 50, 30, 20, 40, 70, 60, 80 into the tree (50 becomes the root), then searches for
     * 60 and prints "60 found in BST" if present or "60 not found in BST" otherwise.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        BSTSearch tree = new BSTSearch();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        int key = 60;
        if (tree.search(tree.root, key) != null)
            System.out.println(key + " found in BST");
        else
            System.out.println(key + " not found in BST");
    }
}
