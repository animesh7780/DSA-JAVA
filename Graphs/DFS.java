import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v+1];
        visited[0] = true;

        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, visited, adj, ls);
        return ls;

    }

    void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){

        //marking the node 
        vis[node] = true;
        ls.add(node);

        //travers all the neighbours
        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, vis, adj, ls);
            }
        }
    }
}
