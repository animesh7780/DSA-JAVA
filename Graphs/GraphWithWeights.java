import java.util.ArrayList;

class Pair{
    int val;
    int weight;
    
    Pair(int val, int weight){
        this.val = val;
        this.weight = weight;
    }
    
    // Override toString for better printing
    @Override
    public String toString() {
        return "(" + val + ", " + weight + ")";
    }
}

public class GraphWithWeights {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
        
        // Initialize adjacency list
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Pair>());
        }
        
        // Add edges with proper Pair constructor calls
        adj.get(1).add(new Pair(2, 3));    // Edge from 1 to 2 with weight 3
        adj.get(2).add(new Pair(1, 45));   // Edge from 2 to 1 with weight 45
        adj.get(3).add(new Pair(2, 10));   // Edge from 3 to 2 with weight 10
        adj.get(2).add(new Pair(3, 20));   // Edge from 2 to 3 with weight 20
        adj.get(1).add(new Pair(3, 15));   // Edge from 1 to 3 with weight 15
        adj.get(3).add(new Pair(1, 25));   // Edge from 3 to 1 with weight 25
       
        // Print adjacency list
        for(int i = 1; i <= n; i++){  // Changed condition to i <= n
            System.out.print("Node " + i + ": ");
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
