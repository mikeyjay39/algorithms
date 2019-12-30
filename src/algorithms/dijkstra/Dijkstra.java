package algorithms.dijkstra;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Created by Michael Jeszenka.
 * <a href="mailto:michael@jeszenka.com">michael@jeszenka.com</a>
 * 12/30/19
 */
public class Dijkstra {

    private int[] distances; // array that holds shortest distances
    private Map<Integer, Integer> paths; // list that holds path to each vertex

    public int[] getDistances() {
        return this.distances;
    }

    public Map<Integer, Integer> getPaths() {
        return this.paths;
    }

    public int[] dijkstra(int graph[][], int startingVertex) {
        // init data structures
        int verticesNum = graph.length;
        int verticesVisited = 0;
        distances = new int[verticesNum];
        paths = new HashMap<>();
        Set<Integer> unVisited = new HashSet<>();

        // init distances to max
        for (int i = 0; i < verticesNum; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        // init unVisited and paths
        for (int i = 0; i < verticesNum; i++) {
            unVisited.add(i);
        }

        distances[startingVertex] = 0;
        int curr = startingVertex;
        List<Integer> path = new ArrayList<>();
        //path.add(curr);
        paths.put(curr, curr);

        while (unVisited.size() > 0) {
            // update distances
            for (int i = 0; i < verticesNum; i++) {
                int distance;

                // check if it has an edge to this vertex
                if ((distance = graph[curr][i]) > 0) {
                    // update distance if shorter
                    if (distances[curr] + distance < distances[i]) {
                        distances[i] = distances[curr] + distance;

                        // update path
                        //path = new ArrayList<>(paths.get(curr));
                        //path.add(curr);
                        paths.put(i, curr);
                    }
                }
            }

            // remove curr from unvisited
            unVisited.remove(curr);
            int min = Integer.MAX_VALUE;

            // choose next vertex which is the shortest unvisited
            for (Integer v : unVisited) {
                if (distances[v] < min) {
                    curr = v;
                    min = distances[v];
                }
            }
        }






        return null;
    }



}
