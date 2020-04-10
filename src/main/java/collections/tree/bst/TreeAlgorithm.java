package collections.tree.bst;

public class TreeAlgorithm {

    /**
     * Hacker rank Solution
     */
    boolean checkBST(Node root) {
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.data < minValue || root.data > maxValue) {
            return false;
        }

        return (checkBST(root.left, minValue, root.data - 1)
                && checkBST(root.right, root.data + 1, maxValue)
        );
    }

    /**
     * Different Solution
     */
    boolean isBSTSecondSolution(Node root) {
        return isBinarySearchTree(root, 0, 10000);
    }

    boolean isBinarySearchTree(Node node, int min, int max) {
        if (node.data < min || node.data > max)
            return false;
        /*
        Check this node!
        This algorithm doesn't recurse with null Arguments.
        When a null is found the method returns true
        Look and you will find out.
        */
        /*
         * Checking for Left SubTree
         */
        boolean leftIsBst;
        /* If the Left Node Exists */
        if (node.left != null) {
            /* and the Left Data are Smaller than the Node Data */
            if (node.left.data < node.data) {
                /* Check if the subtree is Valid as well */
                leftIsBst = isBinarySearchTree(node.left, min, node.data);
            } else {
                /* Else if the Left data are Bigger return false */
                leftIsBst = false;
            }
        } else /* if the Left Node Doesn't Exist return true */ {
            leftIsBst = true;
        }

        /*
         * Checking for Right SubTree - Similar Logic
         */
        boolean rightIsBst;
        /* If the Right Node Exists */
        if (node.right != null) {
            //and the Right Data are Bigger (or Equal) than the Node Data
            if (node.right.data >= node.data) {
                /* Check if the subtree is Valid as well */
                rightIsBst = isBinarySearchTree(node.right, node.data + 1, max);
            } else {
                /* Else if the Right data are Smaller return false */
                rightIsBst = false;
            }
        } else /* if the Right Node Doesn't Exist return true */ {
            rightIsBst = true;
        }

        /* if both are true then this means that subtrees are BST too */
        return (leftIsBst && rightIsBst);
    }

}

