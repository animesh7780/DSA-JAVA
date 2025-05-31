//Brute Approach
// public class SetZeros{
//     public static void main(String[] args) {
        
//     }
//     public static void setZeros(int[][] arr){
//     int m = arr.length;
//     int n = arr[0].length;
//     int[] col = new int[n];
//     int[] row = new int[m];
    
//     for(int i = 0; i < m; i++){
//         for(int j = 0; j < n; j++){
//             if(arr[i][j] == 0){
//                 row[i] = 1;
//                 col[j] = 1;
//             }
//         }
//     }
//     for(int i = 0; i < m; i++){
//         for(int j = 0; j < n; j++){
//             if(row[i] == 1 || col[j] == 1){
//                 arr[i][j] = 0;
//             }
//         }
//     }
// }
// }

//better approach
public class SetZeros{

    public static void setZeros(int[][] arr){
        int colo = 1;
        int m = arr.length; //-> matrix[0][.]
        int n = arr[0].length; //-> matrix[.][0]
    
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    //mark the ith row 
                    arr[i][0] = 0;
                    //mark the jth col
                    if(j != 0)
                        arr[0][j] = 0;
                    else
                        colo = 0;

                }
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(arr[i][j] != 0){
                    //check for row and coloumn
                    if(arr[j][0] == 0 || arr[0][i] == 0){
                        arr[i][j] = 0;
                    }
                } 
            }
        }
        if(arr[0][0] == 0){
            for(int j = 0; j<n; j++) arr[0][j]  = 0;
        }
        if(colo == 0){
            for(int i=0; i<m; i++){
                arr[i][0] = 0;
            }
        }
    }
}