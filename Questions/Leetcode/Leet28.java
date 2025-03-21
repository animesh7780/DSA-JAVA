import java.util.*;

public class Leet28 {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        Leet28 obj = new Leet28();
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexof(needle);
    }
}
