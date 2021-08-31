package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphBreadthFirstTest {
    @Test
    public void testHappyPath() {
        Graph graph = new Graph();
        graph.addNode("Pandora");
        graph.addNode("Arendelle");
        graph.addNode("Metroville");
        graph.addNode("Monstroplolis");
        graph.addNode("Narnia");
        graph.addNode("Naboo");


        graph.addEdge("Pandora", "Arendelle");
        graph.addEdge("Arendelle", "Metroville");
        graph.addEdge("Arendelle", "Monstroplolis");
        graph.addEdge("Metroville", "Monstroplolis");
        graph.addEdge("Metroville", "Narnia");
        graph.addEdge("Metroville", "Naboo");
        graph.addEdge("Monstroplolis", "Naboo");


        assertEquals(
                "Happy Path: ",
                "[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]",
                graph.breadthFirst("Pandora").toString()
        );
    }


}
