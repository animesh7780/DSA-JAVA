public class Leet151 {
    public static void main(String[] args) {
        String s = "a good   example";
        Leet151 l = new Leet151();
        System.out.println(l.reverseWords2(s));
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public String reverseWords2(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {
                ans += arr[i] + " ";
            }
        }
        return ans.trim();
    }
}
