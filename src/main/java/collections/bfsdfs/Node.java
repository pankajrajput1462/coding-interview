package collections.bfsdfs;

import java.util.ArrayList;
import java.util.List;

/**
 * The Node class represents a station in this tutorial and will as such have a
 * string representing the station's name. As well as an ArrayList of nodes that
 * will store any instantiated nodes children.
 */
public class Node {

    /* A Unique Identifier for our node */
    public String stationName;

    public String getStationName() {
        return stationName;
    }

    /* An arraylist containing a list of Nodes that.
    This node is directly connected to - It's child nodes. */
    Node leftChild;
    Node rightChild;

    public Node(String stationName, Node firstChild, Node secondChild) {
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }

    public List<Node> getChildren() {
        ArrayList<Node> childNodes = new ArrayList<>();
        if (this.leftChild != null) {
            childNodes.add(leftChild);
        }
        if (this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }
}