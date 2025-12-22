public class RowWithMax1s {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int j = arr[0].length-1;
        int ans = -1;
        for(int i=0; i<n; i++){
            while(j>=0 && arr[i][j]==1){
               ans = i; 
               j--;
            }
        
        if(j==-1) return i;
        }
        return ans;
    }
    
}
