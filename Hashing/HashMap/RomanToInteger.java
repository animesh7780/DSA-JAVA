import java.util.HashMap;

public class RomanToInteger{
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for(int i=0; i<s.length()-1; i++){
            int curr = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));

            if(curr < nextVal){
                total -= curr;
            }
            else{
                total += curr;
            }
        }
        total += map.get(s.charAt(s.length()-1));
        return total;
    }
}