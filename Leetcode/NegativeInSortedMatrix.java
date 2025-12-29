public class NegativeInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int low = 0, high = n*m - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low)/2;
            int row = mid / m;
            int col = mid % m;

            if(grid[row][col] < 0) count++;
            else if(grid[row][col] > 0) high = mid - 1;
            else low = mid + 1;
        }
        return count;
    }
}
