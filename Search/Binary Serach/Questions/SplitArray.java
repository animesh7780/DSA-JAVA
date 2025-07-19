import java.util.Arrays;

public class SplitArray {
    public int splitArray(int[] arr, int k){
        int left = Arrays.stream(arr).max().orElse(0);//At least the largest ele
        int right = Arrays.stream(arr).sum();//At most entire sum

        while(left < right){
            int mid = left + (right - left)/2;
            if(canSplit(arr, k, mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }

    boolean canSplit(int[] arr, int k, int maxSum){
        int splits = 1;
        int currSum = 0;
        for(int num : arr){
            if(currSum+num > maxSum){
                splits++;
                currSum = num;
                if(splits > k){
                    return false;
                }
            }
            else{
                currSum += num;
            }
        }
        return true;
    }
}
