package algorithms.dfs;

/**
 * Created by Michael Jeszenka.
 * <a href="mailto:michael@jeszenka.com">michael@jeszenka.com</a>
 * 12/30/19
 */

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
public class Graph {

    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    private List<String> tempOutput = new ArrayList<>(); // holds vertices as they appear

    // Constructor
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    public void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    public String DFS(int v)
    {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(v);
        Integer curr;

        while ((curr = stack.poll()) != null) {
            tempOutput.add(curr.toString());
            visited.add(curr);

            // add neighbors
            List<Integer> neighbors = adj[curr];
            for (int i = neighbors.size() - 1; i >= 0; i--) {
                int neighbor = neighbors.get(i);

                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        return String.join(" ", tempOutput);
    }
}
