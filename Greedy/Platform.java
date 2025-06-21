import java.util.Arrays;

public class Platform {
    int noOfPlatforms(int[] ar, int[] dep, int N){
        int plat_need = 1;
        int i=1;
        int j=0;

        Arrays.sort(ar);
        Arrays.sort(dep);

        while(i < N && j < N){
            if(ar[i] < dep[j]){
                plat_need++;
                i++;
            }
            else if(ar[i] > dep[j]){
                plat_need--;
                j++;
            }
        }
        return plat_need;
    }
}
