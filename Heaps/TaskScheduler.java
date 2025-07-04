import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    
    int leastInterval(char[] tasks, int n){
        HashMap<Character, Integer> map = new HashMap<>();

        //adding all the elements int map wit frequency
        for(char task : tasks){
            map.put(task, map.getOrDefault(task, 0)+1);
        }

        //Max heap to take task with max frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.addAll(map.values());

        Queue<int[]> cooldownQueue = new LinkedList<>();

        int time = 0;

        while(!pq.isEmpty() || !cooldownQueue.isEmpty()){
            time++;

            // Add tasks back from cooldown if they're available
            if (!cooldownQueue.isEmpty() && cooldownQueue.peek()[1] == time) {
                pq.offer(cooldownQueue.poll()[0]);
            }
            
            // Execute highest frequency task
            if (!pq.isEmpty()) {
                int currentTaskCount = pq.poll() - 1;
                if (currentTaskCount > 0) {
                    // Put task in cooldown, available after n+1 time units
                    cooldownQueue.offer(new int[]{currentTaskCount, time + n + 1});
                }
            }
        }
        return time;
    }
}
