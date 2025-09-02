import java.util.Arrays;

public class Rank {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] assignRank = new String[n];
        boolean[] vis = new boolean[n];

        for(int rank=1; rank<=n; rank++){
            int maxInd = -1;
            int maxVal = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                if(!vis[i] && score[i] > maxVal){
                    maxVal = score[i];
                    maxInd = i;
                }
            }
            vis[maxInd] = true;

            if(rank == 1){
                assignRank[maxInd] = "Gold Medal";
            }
            else if(rank == 2){
                assignRank[maxInd] = "Silver Medal";
            }
            else if(rank == 3){
                assignRank[maxInd] = "Bronze Medal";
            }
            else{
                assignRank[maxInd] =    String.valueOf(rank);
            }
        }
        return assignRank;
    }

    public String[] findRelativeRanks1(int[] score){
        int n = score.length;
        String[] giveRank = new String[n];
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = score[i];
        }

        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                giveRank[i] = "Gold";
            }
            else if(i == n-2){
                giveRank[i] = "Silver";
            }
            else if(i == n-3){
                giveRank[i] = "Bronze";
            }
            else{
                giveRank[i] = "i+1";
            }
        }
        return giveRank;
    }
}
