package geeks4geeks.bfs;

import java.io.*;
import java.util.*;

/**
 * Created by Michael Jeszenka.
 * <a href="mailto:michael@jeszenka.com">michael@jeszenka.com</a>
 *
 * Base taken from GeeksforGeeks: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * 12/30/19
 */
// This class represents a directed graph using adjacency list
// representation
public class Graph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    public String BFS(int s)
    {
        // TODO implement this
        return null;
    }


}