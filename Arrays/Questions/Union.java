//brute force

// import java.util.ArrayList;
// import java.util.HashSet;

// public class Union {
//     public static void main(String[] args) {
//         int[] arr = 
//     }
//     public static ArrayList<Integer> unionOfArray(int[] arr1, int[] arr2){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i < arr1.length; i++){
//             set.add(arr1[i]);
//         }
//         for(int i=0; i < arr2.length; i++){
//             set.add(arr2[i]);
//         }

//         ArrayList <Integer> union = new ArrayList<>();
//         for(int item : set){
//             union.add(item);
//         }

//         return union;
//     }
// }

//optimal approach

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> unionOfArray(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0;
        int j=0;

        ArrayList <Integer> list = new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                if(list.size() == 0 || !list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.size() == 0 || !list.contains(arr1[i])){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<n2){
                if(list.size() == 0 || !list.contains(arr1[i])){
                    list.add(arr2[j]);
                }
                j++; 
        }

        while(i<n1){
            if(list.size() == 0 || !list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
        }
        return list;
    }
}