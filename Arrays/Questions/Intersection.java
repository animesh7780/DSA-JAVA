import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> findintersection(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0;
        int j=0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr1[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
            }
        }
        return list;
    }
}
