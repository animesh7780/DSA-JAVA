import java.util.ArrayList;

public class Divivsor {
    ArrayList<Integer> allDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while(i <= Math.sqrt(n)){
            if(n%i == 0) list.add(i);
            i++; 
        }
        return list;
    }
}
