public class MaxWordsToType {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken = new boolean[1];
        int count = 0;

        for(char c : brokenLetters.toCharArray()){
            broken[c - 'a'] = true;
        }

        for(String s : text.split(  " ")){
            boolean ok = true;
            for(char z : s.toCharArray()){
                if(broken[z - 'a']){
                    ok = false;
                    break;
                }
            }
            if(ok) count++;
        }
        return count;
    }
}
