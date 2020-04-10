package collections.bfsdfs;

import org.junit.jupiter.api.Test;

class GraphTest {

    @Test
    void addEdge() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "
                + "(starting from vertex 2)");
        g.bfs(2);
    }
}