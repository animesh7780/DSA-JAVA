public class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,8};
        int s = 3;
        System.out.println(search(arr, s));
    }
    public static boolean search(int arr[], int s){
        int n = arr.length;
        for(int i=0; i < n; i++){
            if(arr[i] == s){
                return true;
            }
        }
        return false;
    }
}