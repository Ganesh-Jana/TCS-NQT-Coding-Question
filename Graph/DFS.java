package Graph;
import java.util.*;
public class DFS {
    static class DFSGraph{
        int vertices;
        List<List<Integer>> adjList;
        boolean[] visited;
        DFSGraph(int v){
            vertices = v;
            adjList = new ArrayList<>();
            visited = new boolean[v+1];

            for(int i = 0; i<=v; i++){
                adjList.add(new ArrayList<>());
            }
        }
        void addEdge(int u, int v){
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        void dfs(int start){
            visited[start] = true;
            System.out.print(start + " ");
            for(int neighbour : adjList.get(start)){
                if(!visited[neighbour]){
                    dfs(neighbour);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        DFSGraph graph1 = new DFSGraph(N);
        for(int i = 0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph1.addEdge(u,v);
        }
        int start = sc.nextInt();
        graph1.dfs(start);
    }
}
