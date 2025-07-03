import java.util.PriorityQueue;

public class KthSmallest {
    int findMinEle(int[] arr, int k){
        //if we do not write lamda fnc then it basically means minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
