
package unittest;

import algorithms.dijkstra.Dijkstra;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

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

        // check distances
        Assert.assertArrayEquals(distances, expected);

        // check path for vertex 4
        List<Integer> path = new ArrayList<>();
        Map<Integer, Integer> paths = d.getPaths();
        int curr = 4;
        path.add(0, curr);

        while ((curr = paths.get(curr)) != 0) {
            path.add(0, curr);
        }

        path.add(0, 0);

        int[] resultPath = path.stream().flatMapToInt(s -> IntStream.of(s)).toArray();

        Assert.assertArrayEquals(new int[]{0, 7, 6, 5, 4}, resultPath);

    }
}
