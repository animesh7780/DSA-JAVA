import java.util.Arrays;

public class JobScheduling {
    int[] jobsCanBeDone(Job[] arr, int n){
        //sorting a array that conatains different elements 
        //sort them based on their profit
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxi = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].deadline > maxi){
                maxi = arr[i].deadline;
            }
        }

        int result[] = new int[maxi + 1];

      for (int i = 1; i <= maxi; i++) {
         result[i] = -1;
      }

      int countJob = 0;
      int profit = 0;

      for(int i=0; i<n; i++){
        for(int j = arr[i].deadline;j>0; j--){
            if(result[i] == -1){
                result[j] = result[i];
                countJob++;
                profit += arr[i].profit;
                break;
            }
        }
      }
      int ans[] = new int[2];
      ans[0] = countJob;
      ans[1] = profit;

      return ans;
    }
}

class Job {
   int id, profit, deadline;
   Job(int x, int y, int z) {
      this.id = x;
      this.deadline = y;
      this.profit = z;
   }
}
