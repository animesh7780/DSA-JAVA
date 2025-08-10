public class Reorder {
    public boolean reorderedPowerOf2(int n) {
        String target = Sign(n);

        for(int i=0; i<31; i++){
            if(target.equals(Sign(1 << i))){
                return true;
            }
        }
        return false;
    }

    private String Sign(int n){
        char[] chars = String.valueOf(n).toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
