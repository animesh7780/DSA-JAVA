public class UniqueBST {
    public int numTress(int n){
        long catLan = 1;
        for(int i=0; i<n; i++){
            catLan = catLan * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) catLan;
    }
}
