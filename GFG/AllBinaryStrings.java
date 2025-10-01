import java.util.ArrayList;

public class AllBinaryStrings {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int total = 1<<n;

        for(int i=0; i<total; i++){
            String binary = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            ans.add(binary);
        }
        return ans;
    }
}
