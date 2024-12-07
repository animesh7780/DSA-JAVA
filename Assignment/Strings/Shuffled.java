public class Shuffled {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(shuffle(s, indices));
    }

    static String shuffle(String s, int[] indices) {
        char[] str = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] < str.length) {
                str[indices[i]] = s.charAt(i);
            }
        }
        return String.valueOf(str);
    }
}
