import java.util.ArrayList;

public class CountSetBits{
    public static void main(String[] args) {
        CountSetBits obj = new CountSetBits();
        ArrayList<Integer> result = obj.countSetEfficient(5);
        System.out.println("Set bits count for 0 to 5: " + result);
    }
    public ArrayList<Integer> countSetEfficient(int num){
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i <= num; i++){
            int count = 0;
            int temp = i;
            
            // Count set bits directly
            while(temp > 0){
                count += temp & 1;  // Add 1 if last bit is 1
                temp = temp >> 1;   // Right shift
            }
            
            result.add(count);
        }
        
        return result;
    }
}