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
	 * 
	 * @param node
	 * @return
	 */
	private int height(BTNode node) {
		if (node == null) {
			return 0;
		} else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			// use the larger one
			if (lheight > rheight) {
				return lheight + 1;
			} else {
				return rheight + 1;
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
			System.out.println(node.data + " ");
		else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}

	}

	/* Function to insert data recursively */
	private BTNode insert(BTNode node, int data) {
		if (node == null)
			node = new BTNode(data);
		else {
			if (node.getRight() == null)
				node.right = insert(node.right, data);
			else
				node.left = insert(node.left, data);
		}
		return node;
	}

	/* Function to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(BTNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	/* Function to search for an element */
	public boolean search(int val) {
		return search(root, val);
	}

	/* Function to search for an element recursively */
	private boolean search(BTNode r, int val) {
		if (r.getData() == val)
			return true;
		if (r.getLeft() != null)
			if (search(r.getLeft(), val))
				return true;
		if (r.getRight() != null)
			if (search(r.getRight(), val))
				return true;
		return false;
	}

	/* Function for inorder traversal */
	public void inorder() {
		inorder(root);
	}

	private void inorder(BTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	/* Function for preorder traversal */
	public void preorder() {
		preorder(root);
	}

	private void preorder(BTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	/* Function for postorder traversal */
	public void postorder() {
		postorder(root);
	}

	private void postorder(BTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}

	public int height() {
		return height(root);
		
	}
}