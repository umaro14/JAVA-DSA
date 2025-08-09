package DATA_STRUCTURE.GRAPHS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;



public class GraphBFS {
    private Map<Integer, List<Integer>> adjList;

    public GraphBFS(){
        adjList = new HashMap<>();
    }

    public void addVertex(int value){
        adjList.put(value, new LinkedList<>());
    }

    public void addEdge( int start, int destination){
        adjList.get(start).add(destination);
    }

    public void BFS(int start){
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for( int neighbour : adjList.get(vertex)){
                if(!visited[neighbour]){
                   visited[neighbour] = true;
                   queue.add(neighbour);
                }
            }
        }
    }


     public static void main(String[] args) {
        GraphBFS graph = new GraphBFS();
        for (int i = 0; i < 4; i++) graph.addVertex(i);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");
        graph.BFS(2);
    }
}
