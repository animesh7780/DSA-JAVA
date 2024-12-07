public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(new SortingTheSentence().sortSentence("is2 sentence4 This1 a3"));
    }

    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            int index = Integer.parseInt(words[i].substring(words[i].length() - 1)) - 1;
            result[index] = words[i].substring(0, words[i].length() - 1);
        }
        return String.join(" ", result);
    }
}
