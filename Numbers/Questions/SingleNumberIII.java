public class SingleNumberIII {
    public int[] singleNumber(int[] arr){
        int xor = 0;
        //xor all numbers
        for(int n : arr){
            xor ^= n;
        }

        //find the rightmost bit
        int rightMostBit = xor & (-xor);

        int[] result = new int[2];
        //divide numbers into groups
        for(int num : arr){
            if((num & rightMostBit) == 0){
                result[0] ^= num;
            }else{
                result[1] ^= num;
            }
        }
        return result;
    }
}
