public class LatgestTriangle{
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        
        // Try all possible combinations of three points
        for (int[] point1 : points) {
            int x1 = point1[0], y1 = point1[1];
            
            for (int[] point2 : points) {
                int x2 = point2[0], y2 = point2[1];
                
                for (int[] point3 : points) {
                    int x3 = point3[0], y3 = point3[1];
                    
                    // Calculate vectors from point1 to point2 and point1 to point3
                    int u1 = x2 - x1, v1 = y2 - y1;
                    int u2 = x3 - x1, v2 = y3 - y1;
                    
                    // Calculate area using cross product formula
                    double currentArea = Math.abs(u1 * v2 - u2 * v1) / 2.0;
                    
                    // Update maximum area
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        
        return maxArea;
    }
}