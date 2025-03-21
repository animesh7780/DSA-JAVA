public class Leet58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
    }

    public int lengthOfLastWord(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Find the index of the last space
        int lastSpace = s.lastIndexOf(" ");
        
        // Get the last word using substring
        String lastWord = s.substring(lastSpace + 1);
        
        // Return the length of the last word
        return lastWord.length();
    }
    
}
