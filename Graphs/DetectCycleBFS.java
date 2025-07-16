import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetectCycleBFS {
    public boolean detectCycleInGraph(int V, int e) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Read e edges
        for(int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }
        
        return hasCycleBFS(V, adj);
    }

    private boolean hasCycleBFS(int v, List<List<Integer>> adj){
        boolean[] vis = new boolean[v];

        for(int i=0; i<v; i++){
            if(!vis[i]){
                
            }
        }
    }
}
