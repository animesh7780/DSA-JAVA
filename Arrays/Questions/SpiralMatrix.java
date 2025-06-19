import java.util.ArrayList;

public class SpiralMatrix {
    
    ArrayList<Integer> findSpiral(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length == 0) return list;
        
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;
        
        while(top <= bottom && left <= right) {
            // Traverse right along top row
            for(int col = left; col <= right; col++) {
                list.add(arr[top][col]);
            }
            top++;
            
            // Traverse down along right column
            for(int row = top; row <= bottom; row++) {
                list.add(arr[row][right]);
            }
            right--;
            
            // Traverse left along bottom row (if we still have rows)
            if(top <= bottom) {
                for(int col = right; col >= left; col--) {
                    list.add(arr[bottom][col]);
                }
                bottom--;
            }
            
            // Traverse up along left column (if we still have columns)
            if(left <= right) {
                for(int row = bottom; row >= top; row--) {
                    list.add(arr[row][left]);
                }
                left++;
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        
        // Test case 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        ArrayList<Integer> result1 = sm.findSpiral(matrix1);
        System.out.println("Spiral order: " + result1);
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
