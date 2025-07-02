public class TrappingRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;

        int[] leftMax = prefixMax(height);
        int[] rightMax = suffixMax(height);
        

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            total += Math.max(0, waterLevel - height[i]); 
        }

        return total;
    }

    int[] prefixMax(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];  
        prefix[0] = height[0];     
        for(int i = 1; i < n; i++) { 
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }
        return prefix;
    }

    int[] suffixMax(int[] height) {
        int n = height.length;
        int[] suffix = new int[n]; 
        suffix[n-1] = height[n-1]; 
        for(int i = n-2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i+1], height[i]); 
        }
        return suffix;
    }
}
