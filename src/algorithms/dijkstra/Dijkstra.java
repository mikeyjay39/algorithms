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
    private List<Map<Integer, Integer>> paths = new ArrayList<>(); // list that holds path to each vertex

    public int[] getDistances() {
        return this.distances;
    }

    public List<Map<Integer, Integer>> getPaths() {
        return this.paths;
    }

    public int[] dijkstra(int graph[][], int startingVertex) {
        // TODO - implement this

        return null;
    }

}
