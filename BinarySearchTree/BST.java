// Russell Kosovsky 4/11/23
// Binary Search Tree java class using linked nodes

public class BST {
    private Node root;
    public BST() {
        root = null;
    }
    public boolean isEmptyTree() {
        return root == null;
    }
    public Node search(int key) {
        return search2(root, key);
    }
    private Node search2(Node node, int key) {
        if (node == null || node.getKey() == key) {
            return node;
        }
        if (key < node.getKey()) {
            return search2(node.getLeft(), key);
        }
        return search2(node.getRight(), key);
    }
    public void insert(Node node) {
        root = insert2(root, node);
    }
    private Node insert2(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        }
        if (node.getKey() < root.getKey()) {
            root.setLeft(insert2(root.getLeft(), node));
        } else if (node.getKey() > root.getKey()) {
            root.setRight(insert2(root.getRight(), node));
        }
        return root;
    }
    public void delete(Node node) {
        root = delete2(root, node.getKey());
    }
    private Node delete2(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.getKey()) {
            root.setLeft(delete2(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(delete2(root.getRight(), key));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            root.setKey(minValue(root.getRight()));
            root.setRight(delete2(root.getRight(), root.getKey()));
        }
        return root;
    }
    private int minValue(Node root) {
        int minValue = root.getKey();
        while (root.getLeft() != null) {
            minValue = root.getLeft().getKey();
            root = root.getLeft();
        }
        return minValue;
    }
    public void traverse() {
        traverse2(root);
        System.out.println();
    }
    private void traverse2(Node node) {
        if (node != null) {
            traverse2(node.getLeft());
            System.out.print(node.getKey() + " ");
            traverse2(node.getRight());
        }
    }
    public void printTree() {
        printTree2(root);
        System.out.println();
    }
    private void printTree2(Node root) {
        if (root != null) {
            System.out.print(root.getKey() + " ");
            if (root.getLeft() != null)
                System.out.print("Left: " + root.getLeft().getKey() + " ");
            else
                System.out.print("Left: null ");
            if (root.getRight() != null)
                System.out.println("Right: " + root.getRight().getKey() + " ");
            else
                System.out.println("Right: null ");
            printTree2(root.getLeft());
            printTree2(root.getRight());
        }
    }
}

