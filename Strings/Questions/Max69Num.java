public class Max69Num {
    public int max69Number(int num){
        int fullMax = 0;
        char[] nums = String.valueOf(num).toCharArray();

        for(int i=0; i<nums.length; i++){
            int maxNum = 0;
            if(nums[i] == '9'){
                nums[i] = 6;
            }
            else{
                nums[i] = 9;
            }
            maxNum += nums[i];
            fullMax = Math.max(fullMax, maxNum);

        }
        return fullMax;
    }
}
