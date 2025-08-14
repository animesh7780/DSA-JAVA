public class Largest3Same {
    public String largestGoodInteger(String num) {
        String[] numbers = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        
        for(String pattern : numbers){
            if(num.contains(pattern)){
                return pattern;
            }
        }
        return "";
    }
}
