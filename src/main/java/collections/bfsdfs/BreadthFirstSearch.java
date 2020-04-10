package collections.bfsdfs;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

@Slf4j
public class BreadthFirstSearch {

    private final Node startNode;
    private final Node goalNode;

    public BreadthFirstSearch(Node start, Node goalNode) {
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute() {
        if (this.startNode.equals(goalNode)) {
            log.info("Goal Node Found!");
            log.info("{}", startNode);
        }
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current.equals(this.goalNode)) {
                log.info("{}", explored);
                for (Node node : explored) {
                    log.info("{}", node.getStationName());
                }
                return true;
            } else {
                if (current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }
        return false;

    }

}
