package Graph;
import java.util.*;
public class Undirected_Graph_Implementation {
    static class Graph{
        private int vertices;
        private List<List<Integer>> adjList;
        Graph(int v){
            vertices = v;
            adjList = new ArrayList<>();

            for(int i = 0; i<=v; i++){
                adjList.add(new ArrayList<>());
            }
        }
        void addEdge(int u, int v){
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        void printGraph(){
            for(int i = 1; i<=vertices; i++){
                System.out.print("Station "+ i + " -> ");
                for(int neighbor : adjList.get(i)){
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of Vertices
        int M = sc.nextInt(); // Number of Edges
        Graph graph = new Graph(N);
        for(int i = 0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u,v);
        }
        graph.printGraph();
    }
}
