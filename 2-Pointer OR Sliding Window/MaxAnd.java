public class MaxAnd {
    public int longestSubarray(int[] arr){
        int maxVal = Integer.MIN_VALUE;
        for(int num : arr){
            maxVal = Math.max(maxVal, num);
        }

        int maxLen =0;
        int currLen  = 0;
        for(int n : arr){
            if(n == maxVal){
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            }else{
                currLen = 0;
            }
        }
        return maxLen;
    }
}
