public class AddtoValid{
    public int minParentheses(String s) {
        // code here
        int open = 0;
        int add = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }else{
                    add++;
                }
            }
        }
        return open + add;
    }
}