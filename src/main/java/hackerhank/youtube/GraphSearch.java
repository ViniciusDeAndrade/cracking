package hackerhank.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class GraphSearch {

    private Map<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();
        private Node (int id) {
            this.id = id;
        }
    }

    private Node getNode(Integer id) {
        return nodeLookup.get(id);
    }

    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    /**
     *  Depth First Search - busca em profundidade
     * @return true if there is a way between two nodes
     */
    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, Set<Integer> visited) {
        if (visited.contains(source.id)) return false;

        visited.add(source.id);
        if (source == destination) return true;

        for (Node child: source.adjacent){
            return hasPathDFS(child, destination, visited);
        }
        return false;
    }

    /**
     *  Breadth-first search - busca em largura
     * @return true if there is a way between two nodes
     */
    public boolean hasPathBFS(Node source, Node destination) {
        var nextToVisit = new LinkedList<Node>(); //queue
        Set<Integer> visited = new HashSet<>();
        nextToVisit.add(source);
        while (!nextToVisit.isEmpty()) {
            var node = nextToVisit.remove();

            if (node == destination) return true;

            if (visited.contains(node.id)) continue;

            visited.add(node.id);

            nextToVisit.addAll(node.adjacent);
        }
        return false;
    }


}
