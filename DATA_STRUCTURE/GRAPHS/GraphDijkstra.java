package DATA_STRUCTURE.GRAPHS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GraphDijkstra {

    static class  Edge{
        int destination;
        int weight;

        Edge(int destination,int weight){
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Node implements  Comparable<Node> {
        int vertex;
        int distance;
        
        Node(int vertex, int cost){
            this.vertex = vertex;
            this.distance = cost;
        }

        public int compareTo(Node other){
            return this.distance - other.distance;
        }
    }

    private Map<Integer, List<Edge>> adjList;
    private int value;

    public GraphDijkstra(int value) {
        this.value = value;
        adjList = new HashMap<>();
        for( int i = 0; i < value; i++ ){
            adjList.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int start, int destination, int weight){
        adjList.get(start).add( new Edge(destination, weight));
    }

    public void dijkstra(int start){
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        int[] dist = new int[value];
        Arrays.fill(dist, Integer.MAX_VALUE);
    }

}
