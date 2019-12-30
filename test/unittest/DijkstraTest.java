package unittest;

import algorithms.dijkstra.Dijkstra;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Michael Jeszenka.
 * <a href="mailto:michael@jeszenka.com">michael@jeszenka.com</a>
 * 12/30/19
 */
public class DijkstraTest {

    @Test
    public void dijkstraTest() {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        Dijkstra d = new Dijkstra();
        d.dijkstra(graph, 0);
        int[] distances = d.getDistances();
        int[] expected = new int[]{0, 4, 12, 19, 21, 11, 9, 8, 14};

        Assert.assertArrayEquals(distances, expected);
    }
}
