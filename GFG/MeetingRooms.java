import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttend(int[][] arr) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0; i<n; i++){
            if(arr[i][1] > arr[i][0]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,4}, {10,15}, {7, 10}};
    }
}
