import java.util.PriorityQueue;

public class KthLrgest {
    int findMaxEle(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //the fnc (a,b)->b-a signifies maxHeap and it implements that

        int n = arr.length;

        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }

        int f = k-1;

        while(f > 0){
            pq.remove();
            f--;
        }

        return pq.peek();
    }
}
