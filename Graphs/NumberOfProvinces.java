import java.util.ArrayList;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        // Initialize the adjacency list
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        // Build the adjacency list from the matrix
        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        boolean[] vis = new boolean[v]; // Changed from int[] to boolean[]
        int cnt = 0;
        
        for(int i = 0; i < v; i++){
            if(vis[i] == false){
                dfs(i, vis, adj);
                cnt++;
            }
        }
        return cnt;
    }
    
    void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        // marking the node
        vis[node] = true;
        // traverse all the neighbours
        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, vis, adj);
            }
        }
    }
}   