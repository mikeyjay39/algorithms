package unittest;

import algorithms.bfs.Graph;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Michael Jeszenka.
 * <a href="mailto:michael@jeszenka.com">michael@jeszenka.com</a>
 * 12/30/19
 */
public class BfsTest {

    @Test
    public void testBfs() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        String result = g.BFS(2);

        Assert.assertEquals("2 0 3 1", result);
    }
}
