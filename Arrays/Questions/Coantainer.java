public class Coantainer {
    public int maxArea(int[] height){
        int l = height.length;
        int low = 0;
        int high = l-1;
        int maxarea = 0;

        while(low <= high){
            int area = Math.min(height[low], height[high]) * (high - low);
            maxarea = Math.max(maxarea, area);
            if(height[low] <= height[high]){
                low += 1;
            }
            else{
                high -= 1;
            }
        }
        return maxarea;
    }
}
