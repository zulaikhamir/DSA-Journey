class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTSearch {
    Node root;

    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key < key)
            return search(root.right, key);

        return search(root.left, key);
    }

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
