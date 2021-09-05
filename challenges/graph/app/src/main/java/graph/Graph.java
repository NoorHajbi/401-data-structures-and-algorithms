package graph;

import java.util.*;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjVertices;

    Graph() {
        adjVertices = new HashMap<>();
    }


    /**
     * To add vertex
     *
     * @param value
     * @return The added node
     */
    Vertex addNode(String value) {
        Vertex node = new Vertex(value);
        adjVertices.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    /**
     * To add edge
     *
     * @param data1
     * @param data2
     */
    void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }


    void removeVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(new Vertex(data));
    }

    void removeEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeVertex1 = adjVertices.get(vertex1);
        List<Vertex> edgeVertex2 = adjVertices.get(vertex2);

        if (edgeVertex1 != null) {
            edgeVertex1.remove(vertex2);
        }
        if (edgeVertex2 != null) {
            edgeVertex2.remove(vertex1);
        }
    }

    /**
     * @return all the nodes in the graph as a set collection
     */
    public java.util.Set<graph.Vertex> getNodes() {
        return adjVertices.keySet();
    }

    /**
     * @param data
     * @return Returns a collection of edges connected to the given node
     * Include the weight of the connection in the returned collection
     */
    List<Vertex> getNeighbors(String data) {
        Vertex vertex = new Vertex(data);
        return adjVertices.get(vertex);
    }


    String printGraph() {
        if (adjVertices.isEmpty()) {
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (Vertex vertex : adjVertices.keySet()) {
                stringBuilder.append(vertex);
                stringBuilder.append(adjVertices.get(vertex));
            }
            return stringBuilder.toString();
        }
    }

    /**
     * @return the total number of nodes in the graph
     */
    int size() {
        return adjVertices.size();
    }


    /**
     * breadthFirst
     *
     * @param node
     * @return A collection of nodes in the order they were visited.
     */
    Set<Object> breadthFirst(Object node) {
        if (adjVertices.isEmpty()) {
            return null;
        }
        Set<Object> visited = new LinkedHashSet<>();
        Queue<Object> queue = new LinkedList<>();
        queue.add(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            Object tempNode = queue.remove();
            for (Vertex v : getNeighbors(tempNode.toString())) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }

    ///****************** Code 37 ******************///

    void addWeightedEdges(String data1, String data2, int weight) {
        Vertex Vertex1 = new Vertex(data1, weight);
        Vertex Vertex2 = new Vertex(data2, weight);

        adjVertices.get(Vertex1).add(Vertex2);
        adjVertices.get(Vertex2).add(Vertex1);
    }

    /**
     * Determine whether the trip is possible with direct flights,
     * and how much it would cost.
     *
     * @param graph
     * @param citiesNames List
     * @return cost or null
     */
    String businessTrip(Graph graph, List<Object> citiesNames) {
        int cost = 0;
        if (citiesNames.size() <= 1)
            return "null";

        int findWeight;
        for (int i = 0; i < citiesNames.size() - 1; i++) {
            findWeight = findWeight(graph,
                    (String) citiesNames.get(i),
                    (String) citiesNames.get(i + 1));

            if (findWeight == 0)
                return "False, $0";

            cost += findWeight;
        }
        return "True, $" + cost;
    }

    private int findWeight(Graph graph, String city1, String city2) {
        for (Vertex vertex : graph.getNeighbors(city1)) {
            if (Objects.equals(city2, vertex.label)) {
                return vertex.getWeight();
            }
        }
        return 0;
    }

    ///****************** Code 38 ******************///

    Set<Object> depthFirst(Object node) {
        if (adjVertices.isEmpty()) {
            return null;
        }
        Set<Object> visited = new LinkedHashSet<>();
        Stack<Object> stack = new Stack<>();
        stack.push(node);
        visited.add(node);
        while (!stack.isEmpty()) {
            Object tempNode = stack.pop();
                for (Vertex v : getNeighbors(tempNode.toString())) {
                    if (!visited.contains(tempNode)) {
                        visited.add(v.label);
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }

}
