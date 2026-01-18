public class Candy {
    public int minCandy(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        if(n == 0) return 0;
        int[] c = new int[n];

        for(int i=0; i<n; i++){
            c[i] = 1;
        }

        //left to right
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                c[i] = c[i-1] + 1;
            }
        }

        //right to left
        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i+1]){
                c[i] = Math.max(c[i], c[i+1] + 1);
            }
        }
        //returning total candies
        for(int x : c){
            sum += x;
        }
        return sum;
    }
}
