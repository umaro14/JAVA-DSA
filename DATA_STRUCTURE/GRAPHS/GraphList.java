package DATA_STRUCTURE.GRAPHS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class GraphList {

    private Map<Integer, List<Integer>> adjList;

    
    public GraphList(){
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex){
        adjList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int start, int destination){ 
        adjList.get(start).add(destination);            //get() for key map, add() for linked list
        // adjList.get(dest).add(src); // Uncomment for undirected graph
    }

    public void printGraph(){
        for( int vertex : adjList.keySet() ){
            System.out.print(vertex + " -> ");
            for( int neighbour : adjList.get(vertex)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

       public static void main(String[] args) {
        GraphList graph = new GraphList();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 0);

        System.out.println("Adjacency List:");
        graph.printGraph();
    }

}
