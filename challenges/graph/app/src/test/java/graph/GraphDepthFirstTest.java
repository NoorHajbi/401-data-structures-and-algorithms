package graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GraphDepthFirstTest {
    Graph graph3 = new Graph();

    //graph is empty
    @Test
    public void testEmpty() {
        assertNull("Problem with empty graph", graph3.depthFirst("Noor"));
    }

    @Test
    public void testOnlyNodes() {
        graph3.addNode("A");
        graph3.addNode("B");
        graph3.addNode("C");
        graph3.addNode("G");
        graph3.addNode("D");
        graph3.addNode("E");
        graph3.addNode("H");
        graph3.addNode("F");

        assertEquals(
                "No Edges: ",
                "[A]",
                graph3.breadthFirst("A").toString()
        );
    }

    @Test
    public void testHappyPath() {
        graph3.addNode("A");
        graph3.addNode("B");
        graph3.addNode("C");
        graph3.addNode("G");
        graph3.addNode("D");
        graph3.addNode("E");
        graph3.addNode("H");
        graph3.addNode("F");


        graph3.addEdge("A", "B");
        graph3.addEdge("B", "C");
        graph3.addEdge("C", "G");
        graph3.addEdge("B", "D");
        graph3.addEdge("A", "D");
        graph3.addEdge("D", "E");
        graph3.addEdge("D", "H");
        graph3.addEdge("D", "F");
        graph3.addEdge("H", "F");


        assertEquals(
                "Happy Path: ",
                "[A, B, D, C, E, H, F, G]",
                graph3.breadthFirst("A").toString()
        );
    }


}
