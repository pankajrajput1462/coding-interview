package collections.binarytree;

/* Class BT */
class BT {
    private BTNode root;

    /* Constructor */
    public BT() {
        root = null;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Functions to insert data */
    public void insert(int data) {
        root = insert(root, data);
    }

    /**
     * height of the node
     */
    private int height(BTNode node) {
        if (node == null) {
            return 0;
        } else {
            int lHeight = height(node.getLeft());
            int rHeight = height(node.getRight());
            // use the larger one
            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }

    public String levelOrderTraversal() {
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            printGivenLevel(root, i);
        }
        return "Printing Below: ";

    }

    private void printGivenLevel(BTNode node, int level) {
        if (node == null)
            return;
        if (level == 1)
            System.out.println(node.getData() + " ");
        else if (level > 1) {
            printGivenLevel(node.getLeft(), level - 1);
            printGivenLevel(node.getRight(), level - 1);
        }

    }

    /* Function to insert data recursively */
    private BTNode insert(BTNode node, int data) {
        if (node == null)
            node = BTNode.builder().data(data).build();
        else {
            if (node.getRight() == null)
                node.setRight(insert(node.getRight(), data));
            else
                node.setLeft(insert(node.getLeft(), data));
        }
        return node;
    }

    /* Function to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
    private int countNodes(BTNode node) {
        if (node == null)
            return 0;
        else {
            int count = 1;
            count += countNodes(node.getLeft());
            count += countNodes(node.getRight());
            return count;
        }
    }

    /* Function to search for an element */
    public boolean search(int val) {
        return search(root, val);
    }

    /* Function to search for an element recursively */
    private boolean search(BTNode node, int val) {
        if (node.getData() == val)
            return true;
        if (node.getLeft() != null)
            if (search(node.getLeft(), val))
                return true;
        if (node.getRight() != null)
            return search(node.getRight(), val);
        return false;
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    /* Function for postOrder traversal */
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(BTNode node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public int height() {
        return height(root);

    }
}