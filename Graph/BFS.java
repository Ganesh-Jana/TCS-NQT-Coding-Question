package Graph;
import java.util.*;
public class BFS {
    static class Graph{
        int vertices;
        List<List<Integer>> adjList;
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
        void bfs(int start){
            boolean[] visited = new boolean[vertices+1];
            Queue<Integer> queue = new LinkedList<>();
            visited[start] = true;
            queue.add(start);
            System.out.println("BFS Traversal: ");
            while(!queue.isEmpty()){
                int node = queue.poll();
                System.out.print(node + " ");

                for(int neighbour: adjList.get(node)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true;
                        queue.add(neighbour);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Graph graph = new Graph(N);
        for(int i = 0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u,v);
        }
        int start = sc.nextInt();
        graph.bfs(start);

    }
}
