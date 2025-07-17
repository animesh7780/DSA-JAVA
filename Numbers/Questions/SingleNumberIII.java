public class SingleNumberIII {
    public int[] singleNumber(int[] arr){
        int res[] = new int [2];
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
            res[i] = ans;
        }
        return res;
    }
}
