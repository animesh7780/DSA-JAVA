public class Leet389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Leet389 obj = new Leet389();
        System.out.println(obj.findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char c : s.toCharArray()) {
            sumS += c;
        }

        for (char c : t.toCharArray()) {
            sumT += c;
        }

        return (char) (sumT - sumS);
    }
}
