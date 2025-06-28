public class LargestOdd {
    public String largestOddNumber(String num) {
        for(int i=num.length(); i>=0; i--){
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                // Found the rightmost odd digit
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
