import java.util.List;

public class ConnectedComponent {
    public int findNumberOfComponent(int V, List<List<Integer>> edges) {
        
        boolean[] vis = new boolean[V];
        int count = 0;

        for(int i=0; i<V; i++){
            if(vis[i] == false){
                dfs(i, vis, edges);
                count++;
            }
        }
        return count;
    }

    void dfs(int node, boolean[] vis, List<List<Integer>> edges){
        vis[node] = true;

        for(Integer it : edges.get(node)){
            if(vis[it] == false){
                dfs(it, vis, edges);
            }
        }
    }
}
