import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 9, 10 };
        int target = 7;
        System.out.println(search(arr, target, 0));
        AllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(AllIndex1(arr, target, 0, new ArrayList<>()));

    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList();

    static void AllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        AllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> AllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return AllIndex1(arr, target, index + 1, list);
    }
}
