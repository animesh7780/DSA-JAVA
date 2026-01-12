public class VisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        
        for(int i=1; i<points.length; i++){
            int x1 = points[i-1][0];
            int x2 = points[i-1][1];
            int y1 = points[i][0];
            int y2 = points[i][1];

            int dx = Math.abs(x1 - x2);
            int dy = Math.abs(y1 - y2);

            time += Math.max(dx, dy);
        }

        return time;
    }
}
