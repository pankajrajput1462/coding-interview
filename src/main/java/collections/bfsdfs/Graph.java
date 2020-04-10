package collections.bfsdfs;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Graph {
    /*
    No. of vertices
     */
    private final int V;
    /*
    Adjacency Lists
     */
    private final LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    /* Function to add an edge into the graph */
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /* prints BFS traversal from a given source s */
    void bfs(int s) {
        /* Mark all the vertices as not visited(By default set as false) */
        boolean[] visited = new boolean[V];

        /* Create a queue for BFS */
        LinkedList<Integer> queue = new LinkedList<>();

        /* Mark the current node as visited and enqueue it */
        visited[s] = true;
        queue.add(s);

        while (queue.isEmpty()) {
            /* De-queue a vertex from queue and print it */
            s = queue.poll();
            log.info(s + " ");

            /* Get all adjacent vertices of the de-queued vertex s If a adjacent has not been visited,
            then mark it visited and enqueue it */
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}