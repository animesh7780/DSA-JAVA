public class Celebrity{
    int knowMe(int[][] arr){
        int n = arr.length;

        int[] knowMe = new int[n];
        int[] iKnow = new int[n];

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    //adding the no of people knowing or being known and add them up
                    knowMe[j]++;
                    iKnow[j]++;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(knowMe[i] == n-1 && iKnow[i] == 0){
                return i;
            }
        }
        return -1;
    }
}