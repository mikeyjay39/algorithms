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
        // TODO implement this

        return null;
    }
}
