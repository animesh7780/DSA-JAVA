public class FruitsII {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        int n = fruits.length;
        boolean[] used = new boolean[n];

        for(int i = 0; i < fruits.length; i++){
            boolean placed = false;
            for(int j=0; j<n; j++){
                if(!used[j]  && fruits[i] <= baskets[j]){
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                cnt++;
            }
        }
        return cnt;
    }
    
}
