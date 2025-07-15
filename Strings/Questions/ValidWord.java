public class ValidWord {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        
        // Check for vowels and consonants
        boolean hasVowels = word.matches(".*[aeiouAEIOU].*");
        boolean hasConsonants = word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*");
        
        // Check for special characters
        boolean noSpecialChars = word.matches("^[a-zA-Z0-9]+$");
        
        return hasVowels && hasConsonants && noSpecialChars;
    }
}
 