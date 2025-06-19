public class Max1{
    int rowWithMax1S(int[][] arr){
        int count = 0;
        int row = 0;
        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1) count++;
                
            }
        }
    }
}
